package files;

import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class Files {
    public static void main(String[] args) throws IOException {

//        Створюємо файл. В аргумент передаємо шлях (системний шлях) файлу і назву файла
        File file = new File("D:\\text.txt");

//        Перевіряємо чи інсує
        System.out.println(file.exists());

//        Створюємо файл новий
        System.out.println(file.createNewFile());

//        Створити папку
        File folder = new File("D:\\foo");
        folder.mkdir();

//        Получити канонічний файл
        System.out.println(file.getCanonicalPath());


//        Дістати всі системні змінні
        Properties properties = System.getProperties();
        for (Object o: properties.keySet()) {
            System.out.println(o);
        }


//        Получаємо лінк на основну папку користувача системи
        System.out.println(System.getProperty("user.home"));

        String myFolderPath = System.getProperty("user.home");
        File file1 = new File(myFolderPath);

//        Дізнаємося скільки зайнято пам'яті в папці
        System.out.println(file1.length());

//        Ітеруємо весь вміст папки нашої
        String[] list = file1.list();
        for (String fileOrFolder: list) {
            System.out.println(fileOrFolder);
        }

//        Ми можемо перевірити чи файл являється папкою чи файлом
        File[] files = file1.listFiles();
        for (File fileOrFolder: files) {
            String type = null;
            if (fileOrFolder.isFile()) {
                type = "file";
//                    Можемо видаляти файл
                if (fileOrFolder.getName().equals("text.txt")) {
                    System.out.println("file text txt exists");
                    fileOrFolder.delete();
                }
            } else if (fileOrFolder.isDirectory()){
                type = "folder";
            }
            System.out.println(fileOrFolder.getName() + " " + type);
        }

//            Також у класа File є багато інших методів для роботи з файлами, такі як:
//        file1.getPath(); // шлях файлу
//        file1.canExecute(); // чи файл може запускатися (boolean)
//        file1.canWrite(); // чи файл може записуватися (boolean)
//        file1.canRead(); // чи файл може читатися (boolean)
//        file1.compareTo(); // метод порівняння файлів
//        file1.deleteOnExit(); // видаляє файл при його закриванні
//        file1.equals(); // ще один метод порівняння файлів
//        file1.getFreeSpace(); // отримати кількість вільного місця файла
//        file1.getUsableSpace(); // отримати кількість використовуваного місця файла
//        file1.getParent(); // отримати батьківські елементи файлу / папки
//        file1.isHidden(); // чи файл / папка є закритою
//        file1.isAbsolute(); // чи шлях файл / папки абсолютний
//        file1.renameTo(); // змінити назву файлу / папки
    }
}
