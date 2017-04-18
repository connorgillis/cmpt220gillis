import java.util.*;
public class Problem13dot3
{
    //create sort method for arrayList
    public static void sort(ArrayList<Number> list)
    {
        int minimumIndex;
        Number sorted;
        for (int i=0; i<list.size()-1; i++)
        {
            sorted = list.get(i);
            minimumIndex = i;

            for (int j=i+1; j<list.size(); j++)
                if (sorted.doubleValue() > list.get(j).doubleValue())
                {
                    sorted = list.get(j);
                    minimumIndex = j;
                }


            if (minimumIndex != i)
            {
                list.set(minimumIndex, list.get(i));
                list.set(i, sorted);
            }
        }
    }

    public static void main(String[] args)
    {
        //create new ArrayList obj
        ArrayList<Number> list = new ArrayList<Number>();

        //adding values
        list.add(1);
        list.add(8);
        list.add(2.5);
        list.add(111);
        list.add(2.4);
        list.add(45);

        System.out.println("Unsorted List: ");
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+" ");

        //perform sort method on list obj.
        sort(list);

        System.out.println("\n\nSorted List: ");
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+" ");
    }
}