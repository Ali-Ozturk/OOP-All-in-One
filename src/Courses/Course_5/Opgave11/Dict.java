package Courses.Course_5.Opgave11;
/*
Write a class Dict that takes two type parameters K and V. The class
should represent a dictionary, i.e. a mapping from items of type K to items of type V.
        Internally, the dictionary should maintain a single array of pairs of type Pair<K, V>.
        The dictionary should support the operations: get(K key) and put(K key, V value).
        The get method takes a key argument, searches through the array for an element with
        that key, and returns its value. If the key is not present, it should throw an exception.
        The put method updates the array with a new pair for the mapping from key to value.
        (Hint: If a pair with the key is already in the map it must be updated or removed.)
*/

import Courses.Course_5.Opgave8_9_10.Pair;

public class Dict<K, V> {
    Pair<K, V>[] res = (Pair<K, V>[]) new Object[100];
    int counter = 0;

    public V get(K key) throws IllegalArgumentException {
        for (int i = 0; i < res.length; i++) {
            if (key.equals(res[i].getA())){
                return res[i].getB();
            }
        }
        throw new IllegalArgumentException();
    }

    public void put(K key, V value){
        for (int i = 0; i < res.length; i++) {
            if (key.equals(res[i].getA())){
                res[i] = new Pair<>(key,value);
                return;
            }
        }
        res[counter] = new Pair<>(key,value);
        counter++;
    }
}
