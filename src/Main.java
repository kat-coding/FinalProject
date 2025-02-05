import edu.greenriver.sdev333.BSTSet;
import edu.greenriver.sdev333.HashingSet;
import edu.greenriver.sdev333.MathSet;


public class Main {
    public static void main(String[] args) {

        System.out.println("ISEMPTY SET ONE ------------");
        MathSet<String> one = new HashingSet<>();
        System.out.println(one.isEmpty());
        one.add("first");
        one.add("second");
        one.add("third");
        one.add("fourth");
        one.add("first");
        one.add("tenth");
        one.add("ninth");
        one.add("eleventh");
        System.out.println(one.isEmpty());

        MathSet<String> two = new HashingSet<>();
        two.add("second");
        two.add("fourth");
        two.add("sixth");
        two.add("eighth");
        two.add("sixth");
        two.add("tenth");

        //test add
        System.out.println("TEST ADD SET TWO -----------");
        for (String a: two.keys()) {
            System.out.println(a);
        }
        //test size
        System.out.println("SIZE SET ONE ---------------");
        System.out.println(one.size());
        //test contains
        System.out.println("CONTAINS SET ONE -----------");
        System.out.println(one.contains("first"));
        System.out.println(one.contains("sixth"));
        //test union
        System.out.println("UNION --------------");
        MathSet<String> union = one.union(two);
        for (String a: union.keys()) {
            System.out.println(a);
        }
        System.out.println("INTERSECTION--------");
        //test intersection
        MathSet<String> intersection = one.intersection(two);
        for (String a: intersection.keys()) {
            System.out.println(a);
        }
        //test difference
        System.out.println("DIFFERENCE----------");
        MathSet<String> difference = one.difference(two);
        for (String a: difference.keys()) {
            System.out.println(a);
        }
    }
}