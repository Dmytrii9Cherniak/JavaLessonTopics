package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//      Ієрархія колекцій:

//        Iterable
//        Collection -> List
//                      ->  ArrayList
//                      ->  LinkedList
//                      ->  Vector
//        Collection -> Set
//                -> HashSet
//                -> LinkedHashSet
//                -> TreeSet -> SortedSet
//        Collection -> Queue
//                    -> LinkedList
//                    -> PriorityQueue
//                    -> ArrayDeque
//        Map
//               -> HashTable
//               -> HashMap
//               -> SortedMap   -> TreeMap

//      У Java усе є класи та об'єкти.
//      Кореневим інтерфейсом колекцій є Iterable, потім йде інтерфейс Collection.
//      Ще окремим інтерфейсом колекцій стає Map. Map не exten(дить) інтерфейс iterable. Map є колекцією,
//      однак вона не підпадає під ієрархію колекцій. Map виконує призначення (функції) колекцій (зберігає в собі
//      об'єкти, дозволяє по них проходитися, дивитися їх, маніпулювати ними), але в ієрархію не входить.

//      Структура даних - форма, в якій зберігаються дані (масив, бінарне дерево, об'єкт, одно або дво зв'язаний список).
//      Алгоритми - робота, процеси над цими структурами даних (процес видалення, вставки, сортування, проходження, змінення).
//      Кожна структура даних є краща в чомусь і гірша в іншому.

//      List i Set є найбільш-популярнішими колекціями в Java.
//      List призначений для того щоб зберігати усі елементи, по-принципу як додав так і є.
//      Set зберігає лише унікальні елементи. Set також допомагає нам посортувати елементи по-певному принципу.
//      Усі колекції зберігаються у пакеті Java Util

//      Колекції реалізовані за допомогою Generic (параметризованих) класів. Generics обмежують даний клас, даний тип
//      тими значеннями, які ми вказали (хочемо) щоб перебували всередині. Зараз наші елементи не мають єдиного типу
//      Ми можемо це обмежити за допомогою Generics в діамантових дужках <> . В цих дужках, ми конкретизуємо тип, з яким
//      ми хочемо щоб наша колекція працювала. Давайте конкретизуємо, що це буде суто стрічки. Ми пишемо <String>.
//      Якщо не вводити суто стрічку, воно одразу ж плюється.

//      У Java все зводиться до типів. Колекція хоче працювати лише з одним єдиним типом. І не вказувати тип колекції
//      являється помилкою

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

//      Ми можемо пройтися по колекції

        for (String string: list) {
            System.out.println(string);
        }

//      Якщо ми це поміняємо на LinkedList, то жодної різниці не буде

        List<String> linked_list = new LinkedList<>(); // або LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("1");
        linked_list.add("2");
        linked_list.add("3");

        for (String string: linked_list) {
            System.out.println(string);
        }

//      Різниця лише є в тому, в якій структурі даних вони зберігаються. Наприклад, для ArrayList все зберігається у
//      вигляді звичайного масиву. Усі операції виконуються у вигляді простого масиву.

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        for (String string: arrayList) {
            System.out.println(string);
        }

//      Проблема ArrayList полягає в тому, що якщо ми часто додаємо елементи ми постійно перестворюємо масив

//      LinkedList реалізовує дво-зв'язаний список. Елементи тут зберігаються в певних Нодах, де кожен Нод має всередині
//      себе певний елемент, а крім нього посилання на попередній і на наступний елемент.

//      Перевага у LinkedList є в тому, що елемент додається легше. Для прикладу, маємо ArrayList із 10 елементів.
//      І ми додаємо 11 десь всередині (він буде 5-тим). Це означає, що якщо вже перевищує ліміт ємності масиву, його
//      треба збільшити і всім елементам після 5-го треба поміняти індекс (5-тий стає шостим, 6 стає 7-мим, 7 стає 8-мим).
//      Потрібно змінити індексацію і лише потім додається елемент. У LinkedList все простіше: якщо елемент додається в
//      кінець, посилання останнього елемента на наступний елемент вже вказуватиме не null, і вказуватиме на наступний.
//      Зміни відчув лише 10 елемент. А якщо вставляємо його в середину, для прикладу 5-тим, зміни відчують лише 4 і 6-тий.

//      Частіше використовується ArrayList, бо рідко міняється структура ArrayList. Для прикладу, щось витягуємо з бази
//      даних, чи приходить з відповіді якись масив даних. Він одразу є готовий і рідко ми міняємо це.

//      Ми можемо додавати елементи у певну позицію

        List<String> newListArray = new ArrayList<>();
        newListArray.add("first");
        newListArray.add("second");
        newListArray.add(1, "zero");

        for (String s: newListArray) {
            System.out.println(s); // first, zero, second
        }

//      Метод set() допомагає нам замінити конкретне значення. Вибираємо конкретний індекс і заміняємо

        newListArray.set(0, "new_value");

        for (String s: newListArray) {
            System.out.println(s); // new_value, zero, second
        }

//      Метод get() по-індексу вертає нам певнний об'єкт. Якщо ми вкажемо елемент, якого у нас не існує, нам впаде
//      IndexOutOfBoundsException.

        System.out.println(newListArray.get(2)); // second

//      Метод size() - повертає розмір масиву
//      Метод addAll() - об'єднання 2-х колекцій. Замість одного елемента береться ціла колекція і додається в кінець
//      Метод isEmpty() - true або false, чи пуста колекція
//      Метод toArray() - конвертувати в масив
//      Метод contains() - true або false, якщо такий об'єкт присутній
//      Метод sort() - видаляння
//      Метод remove() - видаляння. Ми можемо передати конкретний об'єкт, який хочемо видалити або можемо передати індекс
//      Метод clear() - очищає весь список
//      Метод containsAll() - перевіряє чи існує певна колекція в колекції
//      Метод indexOf() - вертає індекс певного елемента. Якщо не має такого елемента, помилки не буде. Вернеться нам -1
//      Метод lastIndexOf() - якщо у нас буде декілька однакових елементів, нам вернеться індекс останнього елемента спільного
//      Метод subList() - обрізати від певного до певного елемента колекцію


//      Що таке iterator?

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Bob", 23));
        people.add(new Person(2, "Meyson", 35));
        people.add(new Person(3, "Simpson", 48));

//      Наприклад, нам потрібно:
//      1) знайти людину, ім'я якої закінчується на y.
//      2) У людей, з непарним id, додати 5 років
//      3) Видалити людину, ім'я якої починається на S
//      Застосуємо це все без методів спеціальних

        for (Person person: people) {
            if (person.getName().endsWith("y")) {
                System.out.println(person);
            }
        }

        for (Person person: people) {
            if (person.getId() % 2 != 0) {
                person.setAge(person.getAge() + 5);
                System.out.println(person);
            }
        }


//      У нас є метод remove(), для видаляння. Однак нам впаде помилка, якщо ми спробуємо видалити в циклі for. Тому-шо
//      цикл вже проходиться по готовому списку і коли міняється структура даних у list, він не розуміє, який елемент
//      буде наступним. Для цього є 2 варіанти: ми можемо це зберегти у окрему колекцію і видалити потім. Або ми можемо
//      використати метод iterator()

        for (Person person: people) {
            if (person.getName().startsWith("S")) {
                people.remove(person); // Error
            }
        }

//      Iterator - елемент функціонал, шаблон проєктування, спосіб проходження колекції по-елементно.
//      Iterator має три методи - remove, hasNext, next. Iterator, із самого початку, вказує на перший елемент нашої
//      колекції. Він не робить копії елементу, це чіткий вказівник на нашу колекцію. Ми не працюємо з копією.
//      hasNext() метод повертає True або False, в залежності, чи є ще куди перевести вказівник;
//      метод next() повертає елемент, на який зараз він вказує і переводить вказівник на наступний


//      Якщо нам потрібно в процесі проходження по-колекції видаляти елементи, використовуємо Iterator

        final Iterator<Person> iterator = people.iterator();
        final Person next = iterator.next();
        System.out.println(next); // Bob
        System.out.println(iterator.next()); // Meyson

        while (iterator.hasNext()) {
            final Person person = iterator.next();
            if (person.getName().startsWith("S")) {
                iterator.remove();
            }
        }

        for (Person person: people) {
            System.out.println(person); // Simpson не існує
        }




//      Set: для нього є три реалізації: HashSet, LinkedHashSet, TreeSet
//      Set має методи по-додаванню, однак у ньому відсутні всі методи, які мали щось пов'язане із індексами.
//      Set не має індексів взагалі. Так, як List мали методи додавання у конкретну позицію, заміну, firstIndexOf(),
//      lastIndexOf(), get() і remove() по-індексу. Тут такого нема. Нових методів нема, лише забрали що стосуалося індексів

        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        System.out.println(set); // [third, first, second]

//  Вивід трішки дивний. Чому? HashSet зберігає елементи по-їхніх хешах (по-порядку cпадання хешів).
//  HashCode - числова цілочисельна репрезентація об'єкта. Тобто, по певній формулі розраховується HashCode об'єкта.

//      LinkedHashSet так само зав'язаний на хешах, однак зберігає елементи як List, тобто по-порядку їхнього додавання.
//      Методи ті самі. Якщо ми додамо ідентичний елемент, він не добавиться. В цьому і особливість Set
//      Set зберігає лише унікальні елементи, не допускаючи дублікатів. Він досягає цього завдяки контракту методами
//      Equals i HashCode - методи класу Object. Згенеруємо ми ці методі у класі Person.

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("first");
        linkedHashSet.add("second");
        linkedHashSet.add("second"); // No output
        linkedHashSet.add("third");
        System.out.println(linkedHashSet);

        Set<Person> hashSet1 = new HashSet<>();
        hashSet1.add(new Person(1, "Bob", 23));
        hashSet1.add(new Person(2, "Meyson", 35));
        hashSet1.add(new Person(3, "Simpson", 48));
        hashSet1.add(new Person(3, "Simpson", 48));
        System.out.println(hashSet1);

        int i = 15;
        String s = "a";
        System.out.println(Integer.hashCode(i)); // 15
        System.out.println(s.hashCode()); // 97

//      HashCode - числова репрезентація об'єкту. Кожен об'єкт має свій HashCode

//      Ось ці значення розраховуються за допомогою метода hashCode(). Наш метод hashCode() згерерується по-всім нашим
//      полям. Буде не правильним, генерувати hashCode лише по-деяким полям. HashCode() має забезпечити максимально точну
//      репрезентацію об'єкта. Для прикладу, у нашому класі є 5 полів і ми генеруємо лише по двом із них, значить ми
//      пропускаємо певну унікальність і якщо інший клас має ці самі поля і так само ігнорить 2 поля, але значення
//      пересікаються, значить хешкод буде одинаковим. Це не є правильно і ігнорувати поля не варто.


//      Метод equals() перевіряє об'єкти на рівність. Тут тільки беруться 2 об'єкти: той хто викликає метод і той
//      об'єкт, який ми порівнюємо. Перед перевіркою об'єктів, відбуваються три перевірки:
//      1) Чи ці об'єкти не посилаються (не є ссилкою) на один і той самий об'єкт? Два дорівнює (==) використовується
//      для порівняння примітивів. Коли ми перевіряємо об'єкти і використовуємо == воно перевірятиме комірчини пам'яті.
//      Навіть якщо 2 об'єкти є ідентичними, воно перевіряє чи об'єкт є в тій самій комірці. Комірка пам'яті виділяється
//      за допомогою ключового слова new. Якщо у Java пропадаються всі ссилки на об'єкт, він видаляється автоматично.
//      2) Перевіряється чи вхідний об'єкт, який перевіряєтся методом, не є null. Null - це пустота і якщо ми перевірятимемо
//      щось із null, ми получимо NullPointerException
//      3) Перевіряється чи об'єкти 2-х класів, чи класі одинакові.

//      Після генерування наших equals() i hashCode() методів, наший Simpson не добавиться ще раз.

//      Вся ієрархія Set працює навколо наших хешів. Іноді у нас рідко буває, що у нас є одинакові hashCode. Це називається
//      колізією - коли 2 різні об'єкти можуть мати одинаковий hashCode. Тоді коли hashCode вхідного елемента є одинаковим
//      одиним із hashCode нашої колекції, тоді у нас відбувається перевірка на equals(). Якщо equals() є false, об'єкти
//      є різні, вони додаюьтся у колекцію. Тому у нас таке в Set може бути 2 елементи із одинаковим hashCode, проте
//      вони будуть різні.

//      Контракт між equals() i hashCode() передбачає, що при вставці нового елемента у Set, спочатку викликаються,
//      методи hashCode() - спочатку розраховується хешкод вхідного об'єкта. Він порівнюється з усіма hashCode існуючих
//      елементів нашого Set і тільки тоді, якщо знаходиться об'єкт з одинаковим hashCode, лише тоді викликається метод equals()


//      TreeSet це зберігання елементів у їхньому природньому сортуванню. Тут не можна сортувати, зразу у поточному вигляді
//      В даному випадку, природнє сортування при роботі із стрічками, це по алфавіту

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        System.out.println(treeSet); // One, Three, Two

//      Давайте розглянемо наступний приклад. Створимо і використаємо наші об'єкти класу Person. Код не дасть нам помилки,
//      проте нам впаде exception ClassCastException. Справа в тому, що String імплементує інтерфейс Comparable. Це означає,
//      що ми маємо імплементувати цей інтерфеси, якщо ми хочемо щоб елементи класу зберігалися в TreeSet. Equals() i hashCode
//      вже буде недостатньо. Нам потрібно імлементувати параметризований інтерфейс Comparator - елементи якого типу
//      ми хочемо посортувати. Ключовий метод - compare(), який приймає 2 об'єкти

//      Щоб посортувати нашу колекцію нам потрібно посортувати колекцію по певному полю. Тому, після імплементації
//      метода нашого, в ньому ми прописуємо наступне: return this.getId() - person.getId();
//      Звертаємося до поточного об'єкта і до порівнювального об'єкта. Параметри ми можемо використовувати будь-які і
//      поля так само. Не варто забувати, що для TreeSet, equals i hashCode не відіграють жодної ролі. Всі порівняння
//      відбуваются за допомогою компораторів. TreeSet пов'язаним на методі compare(). compare() вертає значення додатні,
//      якщо об'єкт більший, від'ємне, якщо об'єкт менший і 0 якщо об'єкти рівні

        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1, "One", 21));
        personSet.add(new Person(2, "Two", 23));
        personSet.add(new Person(3,"Three", 25));
        personSet.add(new Person(3,"Three", 25));
        personSet.add(new Person(1,"Three", 25));
        System.out.println(personSet);

//      Давайте розглянемо, як працює метод compare(). Коли ми порівнюємо числа само собою зрозуміло, що порівнюється
//      методом віднімання. Коли ми порівнюємо стрічки, спочатку ми перевіряємо ASCII коди і аналогічно із числами,
//      порівнює наші ASCII коди.

        String string1 = "one";
        String string2 = "one";
        System.out.println(string1.compareTo(string2)); // 0

        String string3 = "bob";
        String string4 = "bos";
        System.out.println(string3.compareTo(string4)); // -17

        String string5 = "a"; // ASCII код 97
        String string6 = "c"; // ASCII код 99
        System.out.println(string5.compareTo(string6)); // -2

//      Якщо ми робимо наступне, то сортування відбувається посимвольно. Береться по-першому символу і дальше, проте
//      якщо вже перші елементи є різні, йому нема сенсу продовжувати порівнювати

        String string7 = "adfgdfgdf"; // ASCII код 97
        String string8 = "adffsf"; // ASCII код 99
        System.out.println(string7.compareTo(string8)); // -2
    }
}