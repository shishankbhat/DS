import java.util.*;
public class swap_alternate {
    static void swap_alternate_num(int arr[], int size)
    {
        for (int i = 0; i < size; i+= 2) {
            if(i+1 < size)
            {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;  
            }   
        }
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elemnts in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        swap_alternate_num(arr,size);
    }
}
