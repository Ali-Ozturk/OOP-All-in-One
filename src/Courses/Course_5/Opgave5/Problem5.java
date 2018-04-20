package Courses.Course_5.Opgave5;

/*
Problem 5. Write a generic method append with a type parameter T that takes two
        arguments of type Array<T> and returns a new array of type Array<T> that contains
        the elements from both arrays. Preserve the order of both arrays.
*/

public class Problem5 {

    public static void main(String[] args) {
        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"D", "E", "F"};

        Object[] arr3 = Problem5.<String>append(arr1, arr2);

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }
    }

    public static <T> T[] append(T[] arr1, T[] arr2) {
        T[] res = (T[]) new Object[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            res[k] = arr1[i];
            ++k;
        }
        for (int i = 0; i < arr2.length; i++) {
            res[k] = arr2[i];
            ++k;
        }

        return res;
    }
}
