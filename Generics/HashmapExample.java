package Generics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(1, 1.0);
        h.put(2, 2.0);
        h.put(3, 3.0);
        h.put(4, 4.0);
        h.put(5, 5.0);
        h.put(6, 6.0);
        h.put(7, 7.0);
        h.put(8, 8.0);
        h.put(9, 9.0);
        h.put(10, 10.0);
        System.out.println(h);
        Set s = h.keySet();
        System.out.println(s);
        Collection c = h.keySet();
        System.out.println(c);
        Set e = h.entrySet();
        System.out.println(e);
    }
}
