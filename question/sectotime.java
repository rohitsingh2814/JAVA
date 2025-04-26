import java.util.Scanner;
class SecondsToTime {
     int sec;
     public SecondsToTime(int seconds){
         sec=seconds;
     }
     
    public void displayTime(){
        int h=sec/3600;
        sec%=3600;
        int m=sec/60;
        sec%=60;
        int s=sec;
        System.out.printf("%02d:%02d:%02d",h,m,s);
        
    }
   
   
   
   
   
   
   
   
}
public class sectotime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalSeconds = s.nextInt();
   

        SecondsToTime timeConverter = new SecondsToTime(totalSeconds);
        timeConverter.displayTime();
    }
}