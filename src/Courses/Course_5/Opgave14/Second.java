package Courses.Course_5.Opgave14;

import java.util.Random;

public class Second {
    public static void main(String[] args) {
/*        System.out.println(reduce3("a", "b", "c", (x, y) -> x + y));
        System.out.println(reduce3("a", "b", "c", (x, y) -> x + "." + y));
        System.out.println(reduce3("a", "b", "c", (x, y) -> x));
        System.out.println(reduce3("a", "B", "c", (x, y) -> x + y + x + y));*/

        // String
        System.out.println(joinAll(new String[] {"a","b","c","d"}, (x, y) -> x + y));
        System.out.println(joinAll(new String[] {"a","b","c","d"}, (x, y) -> x + "." + y));
        System.out.println(joinAll(new String[] {"a","b","c","d"}, (x, y) -> x));
        System.out.println(joinAll(new String[] {"a","b","c","d"}, (x, y) -> new Random().nextBoolean() ? x + y : y + x));
    }

    public static String reduce3(String a, String b, String c, Joinable joinfunction){
        String ab = joinfunction.join(a, b);
        String abc = joinfunction.join(ab, c);
        return abc;
    }

    public static String joinAll(String[] str, Joinable joinfunction){
        if (str.length == 0){
            return "";
        }

        String res = str[0];
        for (int i = 1; i < str.length; i++) {
            res = joinfunction.join(res, str[i]);
        }
        return res;
    }
}
