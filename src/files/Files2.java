package files;

import java.io.*;
public class Files2 {
    public static void main(String[] args) throws IOException {

        //      Створимо файл, щоб робити з ним операції записування інформації
//      Не треба забувати, що роботу з файлами треба обробляти від exceptions (IOException)

        File file = new File("text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

//      FileOutputStream - низькорівневий потік, передаємо файл у який будемо щось записувати
//      Write приймає байтовий масив. Flush допомагає вичистити буфер інформації і close закриває потік
//      Hello виведеться нам у файлі. Якщо ми змінемо це значення, у файлі буде нове - перезаписане значення
//      Якщо ми вставимо другим аргументом true в new FileOutputStream(file, true); інформація буде добавлятися

        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream(file);
            String message = "Hello";
            byte[] messageBytesPart = message.getBytes();
            fileOutputStream1.write(messageBytesPart);
            fileOutputStream1.flush();
            fileOutputStream1.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

//      Допомагає нам зчитати потік клас FileInputStream. Read() так само приймає байтовий масив, який ми створюємо
//      fileInputStream.available() вертає нам допустиме можливе значення по-розміру файлу, який він зчитує
//      І перетворюємо це у звичайну стрічку

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] answer = new byte[fileInputStream.available()];
            fileInputStream.read(answer);
            fileInputStream.close();
            String output = new String(answer);
            System.out.println(output);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }




//      FileWriter - клас, який також здатен записувати дані у файл. Це символьний потік, попередній був байтовий
//      Метод write() приймає у себе стрінгу або масив символів

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("hello, my dear");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

//      FileReader - клас, який допоможе нам зчитати інформацію. В ньому нема такого метода, як available() - просто так
//      Просто так получити допустиму кількість значень. У будь-якого reader, stream, існує метод read(). Він приймає
//      масив, який він має всередині все зчитати або просто вертає int значення. Якщо ми просто виведемо це за допомогою
//      метода System.out.println() ми просто отримаємо посимвольно кожне значення. Щоб це спростити і не дублювати код,
//      ми проходимося циклом і говоримо: поки наший fileReader буде на кожній ітерації зчитувати інформацію з collector,
//      і не буде дорівнювати -1, тому що значення мінус 1 це значення, коли ми дійшли до кінця файлу, то всередині цього
//      collector буде записуватися нове значення. (char) collector - ми получили всі значення нашого файлу посиивольно.

        FileReader fileReader1 = new FileReader(file);

        System.out.println((char) fileReader1.read());
        System.out.println((char) fileReader1.read());
        System.out.println((char) fileReader1.read());
        System.out.println((char) fileReader1.read());
        System.out.println((char) fileReader1.read());
        System.out.println((char) fileReader1.read());
        System.out.println((char) fileReader1.read());

        int collector;
        while ((collector = fileReader1.read()) != -1) {
            System.out.println((char) collector);
            System.out.println();
        }




//      Є ще третій тип потоків - Буфферизований, має найбільший рівнений потоку. Все буде записуватися з нового рядку.

        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Hi");
        printWriter.println("Honey");
        printWriter.flush();
        printWriter.close();

//      BufferedReader - клас, який допоможе нам це зчитати. Він являється лише обгорткою, йому для зчитування
//      необхідно передати об'єкт типу Reader, по суті всі дії виконує fileReader. За допомогою readLine() метода,
//      BufferedReader допомагає зчитувати строку. На кожному виклику bufferedReader.readLine(), нам буде зчитуватися
//      конкретний рядок і якщо файл закінчиться, а ми спробуємо зчитати неіснуюче значення, нам покажеться null.
//      Тому ми так само проходимося циклом: поки наший bufferedReader не є null, ми виводимо інфу

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }


//      Так само, ми можемо записувати дані у файл, серіалізовувати їх. Для цього ми створимо певний клас, назвемо його
//      User. Створмо в ньому поля, конструктор і toString(). Щоб об'єкт записувався у файл, нам потрібно серіалізувати
//      Щоб його серіалізувати його, ми імплементуємо інтерфейс Serialzable. Це пустий інферфейс, який говорить, що якщо
//      будь який клас імплементовує цей інтерфейс, він стає можливим імпортований в будь який файл чи в базу даних.

//      Щоб записати якийсь об'єкти в файл, нам потрібен клас ObjectOutputStream. Він працює з байтовими потоками,
//      Імлементатор цього класу являється FileOutputStream. Він прийматися файл, який буде записувтися.
//      Створюємо наший об'єкт новий, який записуватимемо у файл і за допомогою writeObject() метода записуємо цей об'єкт.
//      Після цього ми побачимо, що у наш файл записався байтовий масив значення,який має об'єкт.


        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Person user = new Person(1, "Bob", false);
        objectOutputStream.writeObject(user);
        outputStream.flush();
        objectOutputStream.close();

//      ObjectInputStream працює разом із FileInputStream, зчитує інфу із конкретного файлу
//      readObject() - зчитуємо наш об'єкт. Говоримо, що це буде об'єкт User
//      І об'єкт наший запишеться у файл, також ми побачимо його у консолі із нормальним виглядом

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            Person user1 = (Person) objectInputStream.readObject();
            System.out.println(user1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//      Якщо всередині нашого класу є поля, які ми не хочемо серіалізувати,
//      якщо ми не хочемо щоб ці поля були записані у файл,
//      ми говоримо що поле буде transient - позначене ним поле не буде записуватися у файл

    }
}
