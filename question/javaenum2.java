import java.util.Scanner;

public class javaenum2 {

    // Enum for days of the week
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        // Method to get the next day
        public static String getNextDay(String currentDay) {
            try {
                Day day = Day.valueOf(currentDay.toUpperCase()); // Convert input to uppercase and get the enum value
                int nextDayIndex = (day.ordinal() + 1) % Day.values().length; // Calculate the next day index
                return Day.values()[nextDayIndex].name(); // Return the name of the next day
            } catch (IllegalArgumentException e) {
                return "Invalid Input"; // Handle invalid input
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Read the input day
        String inputDay = s.nextLine().trim();

        // Get and print the next day or "Invalid Input"
        System.out.println(Day.getNextDay(inputDay));

        
    }
}
///soution 2
// import java.util.Scanner;

// public class NextMeetingDay {

//     // Enum for days of the week
//     enum Day {
//         MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

//         // Method to get the next day
//         public static String getNextDay(String currentDay) {
//             for (Day day : Day.values()) {
//                 if (day.name().equalsIgnoreCase(currentDay)) {
//                     int nextDayIndex = (day.ordinal() + 1) % Day.values().length; // Calculate the next day index
//                     return Day.values()[nextDayIndex].name();
//                 }
//             }
//             return "Invalid Input"; // Return "Invalid Input" if no match is found
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the input day
//         String inputDay = scanner.nextLine().trim();

//         // Get and print the next day or "Invalid Input"
//         System.out.println(Day.getNextDay(inputDay));

//         scanner.close();
//     }
// }

// solution 3
// import java.util.*;
// class program{
//     enum Day{
//         MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY 
        
//     }
        
//         public static Day getday(String currentday){
//             currentday=currentday.toUpperCase();
//             switch(currentday){
//                 case "MONDAY":
//                 return Day.MONDAY;
               
//                 case "TUESDAY":
//                 return Day.TUESDAY;
                    
//                 case "WEDNESDAY":
//                 return Day.WEDNESDAY;
              
//                 case "THURSDAY":
//                 return Day.THURSDAY;
               
//                 case "FRIDAY":
//                 return Day.FRIDAY;
                
//                 case "SATURDAY":
//                 return Day.SATURDAY;
                
//                 case "SUNDAY":
//                 return Day.SUNDAY;
                
//                 default:
//                 return null;
                
//             }
//         }
    
//     public static void main(String[] args){
//         Scanner s= new Scanner(System.in);
//         String  str=s.next();
//         Day day= getday(str);
//         if(day==null){
//             System.out.println("Invalid Input");
//         }
//         else{
//             int index=(day.ordinal()+1)%7;
//             System.out.println(Day.values()[index].name());
//         }
        
//     }
// }




