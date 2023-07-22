import java.util.*;
// O(n^2) in 1 iteration 1 swap smallest element is on 1 position
public class selectionsort {
    static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main5(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num = input.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        selection(arr);
        for(int element : arr)
        {
            System.out.println(element);
        }
    }
}
