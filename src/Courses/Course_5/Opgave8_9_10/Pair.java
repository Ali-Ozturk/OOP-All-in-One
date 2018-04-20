package Courses.Course_5.Opgave8_9_10;

/*
Problem 8. Write a class Pair with two type parameters A and B to represent a pair
        of values (i.e. the class should have two fields of type A and B). Add an appropriate
        constructor and getter methods. Do not add any setters, as the class should be immutable.

Problem 9. Add a method swap to the Pair class. The swap method should return a
        new pair where the first component becomes the second component and vice versa. For
        example, for the pair (true, 42) the method should return (42, true).
        (Hint: You will have to swap the type parameters in the return type.)

Problem 10. Add methods setFst and setSnd to the Pair class. Each method
        should take a type parameter C and return a new pair where the appropriate component
        has been updated. For example, calling setFst with the integer 42 on the pair
        (true, "Hello World") should return (42, "Hello World").
*/

public class Pair<A, B> {
    private A a;
    private B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    Pair<B, A> swap(){
        return new Pair<>(b,a);
    }

    <C> Pair<C, B> setFst(C c){
        return new Pair<>(c,b);
    }

    <C> Pair<A, C> setSnd(C c){
        return new Pair<>(a, c);
    }


}
