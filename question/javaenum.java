

class javaenum{
    enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
        public void display(){
            System.out.println("this day is"+this.name());
        }
    };
    public static void main(String[] args) {
        Day monday=Day.MONDAY;
        int ordinal=Day.MONDAY.ordinal();
        System.out.println(ordinal);
        System.out.println(monday.name());
        Day enumday=Day.valueOf("MONDAY");
        System.out.println(enumday);
        Day[] values =Day.values();
        for(Day i:values){
            System.out.println(i);
        }
        Day.FRIDAY.display();
    }
}