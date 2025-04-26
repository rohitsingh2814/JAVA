public class stringmatching {
    public static void main(String[] args) {
        String str1="ac";
        String str2="";
        System.out.println(str1.matches("."));//only one character is from keyboard.
        System.out.println(str1.matches("[ac]"));//only given aplha in array are matches.
        System.out.println(str1.matches("[^abc]"));//expect given aplha in array are matches.
        System.out.println(str2.matches("[a-z1-4]"));
    }
}