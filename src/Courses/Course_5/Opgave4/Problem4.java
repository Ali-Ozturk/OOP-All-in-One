package Courses.Course_5.Opgave4;

/*Problem 4. Write a generic method extract with a type parameter T that takes an
        argument of type Array<T> and an argument of type T. The method returns the first
        element of the array, if it is non-empty. Otherwise, it returns the second argument.*/

public class Problem4 {

    <T> T extract(T[] arr, T arg){
        if (arr.length == 0){
            return arr[0];
        } else {
            return arr[1];
        }
    }
}
