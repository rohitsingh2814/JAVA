

public class str2{
    public static void main(String[] args) {
        String str="Programmer@gmail.com";
        System.out.println(str.matches(".*gmail.*"));
        String date="01/01/2020";
        System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        int b=010101;
        String binary=String.valueOf(b);
        System.out.println(binary);
        System.out.println(binary.matches("[01]+"));

    }
}