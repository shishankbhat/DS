import java.util.*;
public class find_unique {
    static int find_uniques(int arr[], int size)
    {
        int ans  = 0;
        for (int i = 0; i < size; i++) {
            ans = ans ^ arr[i]; // because similar value xor is always 0 and 0 ^ 1  = 1
            System.out.println(ans + " ");
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();
        // int size = 2*m + 1;
        int arr[] = new int[size];
        System.out.println("Enter elemnts in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find_uniques(arr, size));
        sc.close();
    }
}
