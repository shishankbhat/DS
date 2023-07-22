import java.util.Scanner;
// O(n^2)
public class Bubblesort {
    
    public static void bubble(int arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++) // i means sorted element will not consider
             {
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;                    
                }
            }
        }
    }
    public static void main(String[]args)
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
        bubble(arr);
        for(int element : arr)
        {
            System.out.println(element);
        }
    }
}
