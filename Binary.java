import java.util.*;
public class Binary {
    static int Binarysearch(ArrayList<Integer> list , Integer key)
    {
        //System.out.println(list);
        int start = 0;
        int end = list.size()-1;
        int mid = (start + end ) / 2;
        while(start<=end){
            if(list.get(mid) == key)
            {
                // System.out.println(list.get(mid));
                return mid;
            }
            if(key > list.get(mid))
            {
                start = mid + 1;
                mid = (start + end) / 2;
            }
            else
            {
                end = mid;
                mid = (start + end) / 2;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.println("Enter sorted elements in the array list ");
        for (int i = 0; i < n; i++) {
            int element = input.nextInt();
            arrList.add(i,element);
        }
       // System.out.println(arrList);
       System.out.println("Enter searching element");
       Integer key = input.nextInt();
        int x = Binarysearch(arrList, key);
        if(x != -1)
        {
            System.out.println("Element found on " + x + "Position");
        }
        else{
            System.out.println("Element not found");
        }
        input.close();
    }
}



/*
 Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because the array works on an index basis.
In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:
ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  

Hierarchy of ArrayList class
As shown in the above diagram, the Java ArrayList class extends AbstractList class which implements the List interface. The List interface extends the Collection and Iterable interfaces in hierarchical order.

ArrayList class declaration
Let's see the declaration for java.util.ArrayList class.

public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable  
 */