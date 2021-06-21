package hashCodeEquals;

import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Client c1 = new Client("Maria", "teste@hotmail");
        Client c2 = new Client("Maria", "teste@hotmail");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}
