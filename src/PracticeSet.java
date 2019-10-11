/*
 * @author Sean de Silva
 * @project HashSet
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PracticeSet

{
    // c = (a ∪ b)
    public static <E> Set<E> union(Set<E> a, Set<E> b)
    {
        Set<E> tmp = new TreeSet<E>(a);
        tmp.addAll(b);
        return tmp;
    }

    // c = (a ∩ b)
    public static <E> Set<E> intersection(Set<E> a, Set<E> b)
    {
        Set<E> tmp = new TreeSet<E>();
        for (E x : a)

            if (b.contains(x))
                tmp.add(x);
        return tmp;

    }

    // c = (a – b)
    public static <E> Set<E> difference(Set<E> a, Set<E> b)
    {
        Set<E> tmp = new TreeSet<E>(a);
        tmp.removeAll(b);
        return tmp;
    }

    //                 if (a ⊂ b)
    //                     c = a;
    //                 else
    //                     c = b;
    public static <E> Set<E> setMin(Set<E> a, Set<E> b)
    {
        Set<E> tmp = new TreeSet<E>(a);
        if (a.containsAll(b))
        {
            tmp.addAll(a);
            return tmp;
        }
        else
        {
            tmp.addAll(b);
            return tmp;
        }
    }

    public static void main(String[] args)
    {
        // Create the sets.
        String[] listA = {"Ann", "Sally", "Jill", "Sally"};
        String[] listB = {"Bob", "Bill", "Ann", "Jill"};
        Set<String> setA = new HashSet<>();
        Set<String> setAcopy = new HashSet<>();
        Set<String> setB = new HashSet<>();

        // Load set A from array.
        for (String s : listA)
        {
            setA.add(s);
            setAcopy.add(s);
        }
        // Load set B from array
        for (String s : listB)
        {
            setB.add(s);
        }
        //Dispaly set A and B
        System.out.println("The 2 sets are: " + "\n" + setA + "\n" + setB);

        //call all 4 methods here

        PracticeSet object = new PracticeSet();
        System.out.println("The union of Set A and Set B is: " + object.union(setA, setB));
        System.out.println("The intersection of Set A and Set B is: " + object.intersection(setA, setB));
        System.out.println("The difference of Set A and Set B is: " + object.difference(setA, setB));
        System.out.println("The set minimum of Set A and Set B is: " + object.setMin(setA, setB));
    }
}
