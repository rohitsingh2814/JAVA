
import java.time.LocalTime;

//LocalTime
class date2{
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        LocalTime customTime =LocalTime.of(1,34,30);
        LocalTime pasedTime=LocalTime.parse("15:23:23");
        System.err.println(pasedTime);
        System.err.println(now);
        System.out.println(now.minusHours(1));
        System.out.println(now.minusMinutes(20));
        if(now.isAfter(now.minusHours(1))){
            System.out.println("haa bhai");
        }

    }
}