// 1.LocalDate:represent a date without a time zone
// 2.LocalTime:represent a time without a date or timezone
// 3.LocalDateTime:represent a date and time without a time zone
// 4.ZonedDateTime:Represent a date and time withe time zone
// 5.instant:represent a instantaneous point on the timeline,typically used for machine timestamps
// 6.Duration:represent a duration of time between two points int time
// 7.Period:represent a period of time between two dates
// 8.DateTimeFormatter:formats and pases dates and times
import java.time.LocalDate;
import java.time.Month;
class date{
    public static void main(String[] args) {
        LocalDate now =LocalDate.now();
        LocalDate customDate=LocalDate.of(1990,2,7);
        LocalDate yesterday=now.minusDays(1);
        LocalDate pastDate=now.minusMonths(7);
        int day=now.getDayOfMonth();
        Month month=now.getMonth();
        int monthh=now.getMonthValue();
        int year=now.getYear();
        System.out.println(day);
        System.out.println(month);
        System.out.println(monthh);
        System.out.println(year);
        System.out.println(yesterday);
        System.out.println(pastDate);
         if(now.isAfter(yesterday)){
            System.out.println("Haa bahi");
         }
        System.err.println(customDate);


    }
}



