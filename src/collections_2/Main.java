package collections_2;

import java.util.*;
import java.util.Map.Entry;

public class Main {

//  Зробимо колекцію машин статичною, щоб статичні методи мали доступ до неї
    static Map<Person, List<Car>> personListMap = new HashMap<>();
    public static void main(String[] args) {

//  Якщо ми хочемо працювати із посортоованим Set, тобто якщо ми хочемо мати унікальні і посортовані дані,
//  ми використовуємо TreeSet.

//        List<Person> people = new ArrayList<>();
//        people.add(new Person(1, "Oksana", 20));
//        people.add(new Person(2, "Yulia", 23));
//        people.add(new Person(3, "Marta", 21));

//  Щоб сортувати наший List, вже існує готовий метод sort(). Він приймає в собі comparator, додатковий інтерфейс.
//  Його логіка така сама, як в Comparable. Але Comparable призначений  для того щоб сортувати всі наші поля, для
//  прикладу, спочатку посортувати по-імені, потім по-віку, а потім вже по-id, у нього призначення комлексного сортування.
//  В comparator призначення сортувати саме окреме поле. Не потрібно забувати, що нам нічого не мішає сортувати в comparable
//  лише одне поле, так само як у comparator по-всім полям.

//  Comparator ми не імплементуємо в нашу сутність. Метод sort() добавився у Java 8, раніше все сортувалося через
//  клас collections, у якого ми був цей метод. В цей метод, ми передавали List i Comparator.

//  Щоб посортувати, в метод sort(), нам потрібно передати Comparator - наш інтерфейс. Тобто, ми сюди маємо передати
//  об'єкт типу інтерфейс. Це получається, нам потрібно створити клас і посортувати по певному полю. Для прикладу, посортуємо
//  по полю age: o1.getAge() - o2.getAge(); Відповідно, в наший метод передаємо наш готовий comparator. І, відповідно, воно
//  нам їх всіх посортує.

//        people.sort(new PersonAgeComparator());
//        for (Person person: people) {
//            System.out.println(person);
//        }

//  Але, давайте подумаємо, що якщо нам потрібно багато таких comparator(ів). Ще по-імені, по-id, та ще і по-спаданню
//  по-всім іншим полям, то получається нам потрібно зробити дуже багато класів. Це не дуже нам підходить.
//  Ми знаємо, що об'єкт інтерфесу зробити ми не зможемо, так само як і абстрактого класу. Що тоді ж робити?
//  Ми можемо зробити таку річ, як анонімний клас. Анонімний клас - клас, без імені, клас якому не потрібен окремий файл,
//  призначення якого, щоб в runtime створюється як клас, який імлементує інтерфейс, реалізовує всі його методи і зберігаєьбся
//  у змінній, у нашому випадку, comparator. Ця змінна стає типом Comparator, вона має перевизначений його інтерфейс і
//  ми можемо його передавати і використовувати, як хочемо.

//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getId() - o2.getId();
//            }
//        };

//  В результаті, ми ніякого окремого класу не створювали і це вже краще, наші дані вже є відсортовані.
//  Дані дії ми можемо ще більш спростити за допомогою лямбда виразів.
//  Фактично, лямбда замінила анонімні класи. Нижче, ми зробили абсолютно те саме, що вище в анонімному класі.

//        Comparator<Person> id = (o1, o2) -> o1.getId() - o2.getId();

//  або

//        Comparator<Person> age = Comparator.comparingInt(Person::getId);

//  Comparable є вимогою для лише для роботи із TreeSet. TreeSet не знає, що таке comparator, він працює лише із comparator.
//  TreeSet необхідний метод compareTo() для того щоб порівнювати об'єкти, comparator йому не допоможе.

//  В свою чергу, comparator використовується для сортування List.
//  Невеликий висновок: comparator - це для сортування по-одному полю для list, comparable - сортування усього
//  об'єкта по-всім його полям для TreeSet.




//  Map: належить до колекцій, вона є однією із колекцій, але вона не належить до всєї ієрархії, вона не успадковує
//  інтерфейс collections. Тому що, всі рештка колекцій мають у собі параметризовавно приймає об'єкт,
//  який ми зберігаємо ( List<Person>, для прикладу нащ об'єкт Person ). Ми працюємо з цим об'єктом, і його ми зберігаємо.
//  Так працюють усі наші нащадки із інтерфейсу Collections. Map працює інакше, map діє по-принципу ключ - значення.
//  Де ключем може бути будь-що, значенням може бути будь-що. Для прикладу, ключем у нас буде String, а значенням Person.

//  Map бувають: HashMap, SortedMap, TreeMap, HashTable. В Map нема метода add() (для нащадку інтерфейсу Collections),
//  замість нього метод put(). В ньому є 2 параметри: ключ і значення.

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("first", new Person(1, "Ola", 26));
        personMap.put("second", new Person(2, "Maria", 29));
        personMap.put("third", new Person(3, "Nadia", 21));

//        System.out.println(personMap); //  {third=Person{id=3, name='Nadia', age=21},
                                       //  first=Person{id=1, name='Olya', age=26},
                                       //  second=Person{id=2, name='Maria', age=29}}

//  Third, First, Second - це це ключі. HashMap є схожий на HashSet, тому що ми тоже у нього додавали first, second, third.
//  Всі ті нюанси, які були в Set, наприклад унікальнісь, вона передається на Map. Всі ключі Map повинні бути унікальними.
//  Якщо Set повинен мати усі об'єкти унікальними, так само це правило діє на ключі Map. Наприклад, у нас не може бути два
//  ключа із second.

        personMap.put("second", new Person(2, "Marta", 29));

//  Якщо ми зараз це виведемо, ми побачимо, що у нас оновиться значення ключа second: Maria стала Marta.
//  В Map ключі є унікальнми. Значення можуть бути якими хочемо. На значення, Map взагалі не дивиться. Все, що поширюється
//  від Set до Map, це на її ключі. На значення не нічого поришється: ні унікальність, ні сортування, ні значення.
//  Тільки потрібно пам'ятати, що якщо ми у Map вставимо значення для вже існючого ключа, значення ключа заміниться.


//  LinkedHashMap буде зберігати елементи в порядку їх додавання.

        Map<String, Person> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("first", new Person(1, "Bob", 26));
        linkedHashMap.put("second", new Person(2, "Marley", 29));
        linkedHashMap.put("third", new Person(3, "Sam", 21));
        System.out.println(linkedHashMap); //  {first=Person{id=1, name='Bob', age=26},
                                        //  second=Person{id=2, name='Marley', age=29},
                                        //  third=Person{id=3, name='Sam', age=21}}
        linkedHashMap.put("second", new Person(2, "Jeremy", 31));

//  Тут діє така сама річ: якщо ми спробуємо добавити елемент уже з існуючим ключем, значення елемента цього заміниться,
//  але порядок для нього не міняється. Він вже займає свою комірку.


//  TreeMap зберігає елементи у порядку їхнього природнього сортування. Сортує воно лише по ключам. В нашому випадку,
//  лише для String вимагається щоб був інтерфейс Comparable.

        Map<String, Person> treeMap = new TreeMap<>();
        treeMap.put("first", new Person(1, "Diana", 25));
        treeMap.put("second", new Person(2, "Halina", 29));
        treeMap.put("third", new Person(3, "Anya", 31));

//  Map дуже схожі на Set. Вони теж сприймають лише унікальні елементи, але на унікальність ключа. Якщо це HashMap, воно буде
//  зберігати елементи у порядку хешів. Якщо це LinkedHashMap, воно буде зберігати елементи у порядку додавання ключів.
//  Якщо буде елементи із тим самим ключем, то він всеожно цієї позиції не поміняє. Змінить лише значення. TreeMap буде зберігати
//  елементи в порядку природнього сортування по-ключам.


//  Ряд методів

//  remove() - для видалення певного елемента. Ми вставлємо в нього ключ елемента видаляємого.
//  get() - допоможе дістати елемент по-ключу. Якщо ключа нема, верне null: дістати елемент по-ключу.
//  containsKey() метод вертає boolean тип. Перевіряє, чи існує елемент
//  KetSet() i values() методи допомагають вернути нам ключі і значення нашої колекції. Set тому-що вони є унікальні.
//  Values() - вертає collection

        Set<String> set = treeMap.keySet();
        Collection<Person> values = treeMap.values();

//  putIfAbsent(); - вставить елементи, якщо відсутній. Якщо присутній, просто це проігнорить.
//  clear(); - очистить всі елементи.

//  Всі наші дані зберігаються в масивах нодів. Всередині себе, node має hash ключа, сам ключ і значення. А також посилання,
//  на наступний певний елемент. Цей node імплементує в собі інтерфейс entry.

//  В hashMap елементи зберігаються в масиві нодів.
//  В TreeMap - у вигляді масиву класу entry.

//        printMap(treeMap);

        addNewPerson(new Person(1, "Meyson", 31));
        addCarCarToPerson(1, new Car("Audi", 31000, CarType.SRORTCAR));

        addNewPerson(new Person(2,"Dmytrii", 22));
        addCarCarToPerson(2, new Car( "Opel", 5100, CarType.SUPERCAR));

        addNewPerson(new Person(3,"Maria", 20));
        addCarCarToPerson(3, new Car( "Volvo", 9100, CarType.SUPERCAR));
        addCarCarToPerson(3, new Car( "BMW", 13000, CarType.SOLOCAR));

        deleteCarFromPerson(3, new Car("Opel", 5100, CarType.SUPERCAR));

    }

//  Давйте напишемо метод, щоб пройтися по нашйій всій колекції.
    public static void printMap(Map map) {
        final Set<Entry> set = map.entrySet();
        for (Entry entry : set) {
            System.out.println(entry.getKey());
            System.out.println("\t" + entry.getValue());
        }
    }


//  Entry - це звичайний інтерфейс, який реалізований по-різному відповідно до Map. Entry - об'єкт, який зберігає в собі
//  ключ і значення. Всі елементи у Map зберігаються в entry. Entry вже в собі має ключ і значення.
//  Тому щоб дістати елементи Map, у нас є метод entrySet();

//  Розглянемо наступний приклад. Зробимо міні базу автомобільного сервісу.

//  Спочатку зареєструємо людину. Спочатку, ми не знаємо, з машиною вона чи ні.
//  Добавити людину дуже просто, використовуємо метод put(). Але тут є одне питання: put хоче ще і значення. Наша
//  людина ходить поки без машини, вона просто хоче зареєструватися. Якби це був об'єкт, ми б написали null, але це колекція.
//  Якщо ми говоримо за колекції, завжди правильно передавати пусту колекцію. Щоб не перевіряти потім чи це null чи ні.
//  Ми вже знаємо, що колекція ніколи не буде null. Вона може бути пустою, або наповненою. Але ніколи вона не буле null.
//  Краще уникати перевірок на null.
    public static void addNewPerson(Person person) {
        personListMap.put(person, new ArrayList<>());
    }


//  Потім прив'яжемо її машину, коли людина вже присутня. Метод get() допоможе нам витягнути. Перш ніж витягувати
//  мащини людей, правильно перевірити чи є ця людина. Якщо нема, тоді cars буде null. Ми робимо перевірку: якщо певна людина
//  присутня на автосервісі, ми будемо з нею будемо працювати. Якщо людини нема, то виводимо повідомлення про відсутність особи.

//  В реальності, якщо у нас є певна система, ми не маємо передавати весь об'єкт, ми працюємо з унікальним полем.
//  Нам потрібно дістати машину, з машини людину, коли ми маємо тільки її id. Ми проходимся по ключам колекції. І відповідно, коли
//  ми знаходимо id і якщо вона є рівною ту, яку ми надіслали,

//  В даному випадку, ми маємо лише id. Id є полем person і map про id нічого не знає. Map знає лише про Person. Map не може
//  знайти ключ по-одному лише полю. Ми повертаємо всі наші ключі, проходимося по них і шукаємо людину з таким id.
//  Якщо ми її знаходимо, ми додаємо до неї машину

    public static void addCarCarToPerson(int id, Car car) {
        final Set<Person> keys = personListMap.keySet();
        for (Person key: keys) {
            if (key.getId() == id) {
                final List<Car> cars = personListMap.get(key);
                cars.add(car); // Тут вже не впаде NullPointerException, тому що ми вже передали пусту колекцію в попередній метод
                System.out.println(String.format("Car %s is added for person %s", car.getBrand(), key.getName()));
                return;
            }
        }
    }

//  Видалити машину людини. В аргументи передаємо людину, в якої ми видалємо машину і машину, яку видаляємо
//  Тут робимо аналогічну дію, перевіряємо чи є людина і тоді ми лиш видаляємо машину
    public static void deleteCarFromPerson(int id, Car car) {

        final Set<Person> keys = personListMap.keySet();
        for (Person key: keys) {
            if (key.getId() == id) {
                final List<Car> cars = personListMap.get(key);
                cars.remove(car); // Тут вже не впаде NullPointerException, тому що ми вже передали пусту колекцію в попередній метод
                System.out.println(String.format("Car %s is removed for person %s", car.getBrand(), key.getName()));
                return;
            }
        }

    }


//  Вивести наші елементи
    public static void printCarMap(Map<Person, List<Car>> map) {
        final Set<Entry<Person, List<Car>>> set = map.entrySet();
        for (Entry<Person, List<Car>> entry: set) {
            System.out.println(entry.getKey() + ":");
            final List<Car> cars = entry.getValue();
            for (Car car : cars) {
                System.out.println("\t" + car);
            }
            System.out.println("\t" + entry.getValue());
        }
    }

}   