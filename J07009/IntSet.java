package J07009;

import java.util.Set;
import java.util.TreeSet;

public class IntSet
{
    private int[] arr;

    public IntSet(int[] arr)
    {
        this.arr = arr;
    }

    public IntSet intersection(IntSet A)
    {
        Set<Integer> mySet = new TreeSet<>();
        Set<Integer> res = new TreeSet<>();
        for (int i : arr)
            mySet.add(i);
        for (int i : A.arr)
            if (mySet.contains(i))
                res.add(i);
        return new IntSet(res.stream().mapToInt(Integer::intValue).toArray());
    }

    @Override
    public String toString()
    {
        String s = "";
        for (int i : arr)
            s += Integer.toString(i) + " ";
        return s;
    }
}