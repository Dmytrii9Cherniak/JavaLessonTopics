package dates_and_calendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //      Найпершим класом, з яким працювали з датами в Java був Date (java.util.Date)
//      Об'єкт Date має всі дані пов'язні з датою (дата, час, день тижня, пояс, рік)
        Date date = new Date();
        System.out.println(date); // Получимо нашу точну дату із точною годиною.

//      У Date є ряд певних методів, але справа в тому, що  в IDE вони будуть перекреслені. Це deprecated методи.
//      Це методи, як позначені як такі, що найближчим часом будуть видалені. Або, можливо, в новіших версіях,
//      ці методи уже видалені. Не варто, не рекомендується використовувати deprecated методи. (Анімація @deprecated)

//      Ось ряд методів: отримати годину, хвилину, секунди.
        date.getHours();
        date.getMinutes();
        date.getSeconds();

//      Встановити годину, хвилину, секунди, день, місяць, рік
        date.setHours(12);
        date.setMinutes(13);
        date.setSeconds(15);
        date.setMonth(2);
        date.setYear(12);

//      Отримати місяць, рік, день тижня,
        date.getMonth(); // Отримаємо місяць року від 1 до 12
        date.getYear(); // 122 Тому що рік рахується тут від 1900. 2022 рік - (1900 + 122) = 2022
        date.getDay(); // Отримаємо день тижня від 1 до 7

        date.setTime(25);

//      Є 2 методи, як before i after. Вони вертають булівський тип і перевіряють чи є одна дата ранішою чи пізнішою
        Date dt1 = new Date(2017, 3, 31);
        Date dt2 = new Date(2017, 5, 15);

        boolean result = dt1.before(dt2); // true
        boolean result2 = dt1.after(dt1); // false


//      Іноді буває так, коли ми приймаємо дані у вигляді стрічки. Нам необхідно конвертувати її в дату. Щоб це зробити
//      нам необхідний такий клас, як SimpleDateFormat, в якому ми передаємо паттерн. Тобто тут ми передаємо, як мають
//      виглядати дати, щоб ми могли із стрічки конвертувати власне в обєкт Data. Якщо нам ще час приходить, ми додаємо
//      до патерна hh:mm
//      SimpleDateFormat має такий метод, як parse, який і буде парсити нашу стічку в об'єкт дати. Ми обгортаємо це в
//      try/catch конструцію, бо нам може падати ParseException
//      Щоб конвертнути це в стрічку назад, є метод формат

        String stringDate = "31/03/2022";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateFormat = simpleDateFormat.parse(stringDate);
            System.out.println(dateFormat);
            System.out.println(simpleDateFormat.format(dateFormat));
        } catch (ParseException e) {
            e.printStackTrace();;
        }


//      Інший спосіб: Є такий клас, як Calendar. Він походить із java.util.Calendar. В календаря є такий метод, як
//      getInstance. Метод getInstance() класу Calendar створить об'єкт Calendar, ініціалізований поточною датою.
//      З цим instance ми можемо робити що хочемо

        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
        System.out.println(instance.isLenient());

//      Ми так само можемо діставати те, що ми хочемо за допомогою метода get()
        System.out.println(instance.get(Calendar.YEAR)); // Дістанемо поточний рік (2022)
        System.out.println(instance.get(Calendar.MONTH)); // Дістанемо поточний місяць з 1 до 12 (2)
        System.out.println(instance.get(Calendar.MONTH) == Calendar.MAY); // True або false: перевірка чи зараз травень
        System.out.println(instance.get(Calendar.DAY_OF_MONTH)); // Дістанемо поточний день місяця
        System.out.println(instance.get(Calendar.DAY_OF_WEEK)); // Отримати день тижня
        System.out.println(instance.get(Calendar.DAY_OF_MONTH) == Calendar.SUNDAY); // Перевіряємо чи зараз неділя
        System.out.println(instance.get(Calendar.HOUR_OF_DAY)); // Отримати годину дня
        System.out.println(instance.get(Calendar.MINUTE)); // Отримати хвилину
        System.out.println(instance.get(Calendar.SECOND)); // Отримати секунду
        System.out.println(instance.get(Calendar.AM_PM)); // Отримати годину у 12-ти годинній системі
        System.out.println(instance.get(Calendar.AM_PM) == Calendar.AM); // True або false: перевірка чи час до 12:00
        System.out.println(instance.get(Calendar.AM_PM) == Calendar.PM); // True або false: перевірка чи час після 12:00
        System.out.println(instance.isLenient());
        System.out.println(instance.get(Calendar.MILLISECOND)); // Дістати мілісекунди

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss zzz");
        System.out.println(sdf.format(instance.getTime()));

//      Ми можемо робити тут таке саме, що із звичайним Date
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
        String strDate = "09-04-2018 04:07:33 PM";

        Calendar cal1 = Calendar.getInstance();
        try {
            Date date1 = simpleDateFormat1.parse(strDate);
            cal1.setTime(date1);
            System.out.println("calendar1 time: " + simpleDateFormat1.format(cal1.getTime()));
        } catch (ParseException ex) {
            System.out.println("ParseException occured: " + ex.getMessage());
        }


//      Але є кращий варіант. Появилися такі класи, які називаються LocalDate, LocalTime та LocalDateTime. Вони чітко
//      розділяють з чим потрібно працювати

        String localDateTime = "12-01-1995";

        LocalDate localDate = LocalDate.parse(localDateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(localDate);

//      Також тут є ряд певних методів
        localDate.isLeapYear(); // True або false. Перевірка на високосний рік
        localDate.getYear(); // Отримати рік
        localDate.getMonth(); // Отримати місяць
        localDate.getEra(); // Отримати еру
        localDate.getDayOfYear(); // Отримати день року
        localDate.getDayOfMonth(); // Отримати день місяця
        localDate.getDayOfWeek(); // Отримати день тижня
        localDate.getMonthValue(); // Отримати значення місяця від 1 до 12


        LocalDate a = LocalDate.of(2012, 6, 30);
        LocalDate b = LocalDate.of(2012, 7, 1);
        localDate.isBefore(a);
        localDate.isAfter(b);

        System.out.println(localDate.lengthOfYear()); // Довжина року
        System.out.println(localDate.lengthOfMonth()); // Довжина місяця

        localDate.isEqual(a); // Перевірити чи дана дата одинакова з іншою


    }
}
