import java.util.*;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        char[] charArray = input.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}
// Input 1 :
// Hello
// Output 1 :
// [H, e, l, l, o]
// Input 2 :
// The quick brown fox jumps over the lazy dog.
// Output 2 :
// [T, h, e,  , q, u, i, c, k,  , b, r, o, w, n,  , f, o, x,  , j, u, m, p, s,  , o, v, e, r,  , t, h, e,  , l, a, z, y,  , d, o, g, .]
// Input 3 :
// 123ABC!@#
// Output 3 :
// [1, 2, 3, A, B, C, !, @, #]