import java.util.Scanner;
// Here we divide array in two parts sorted and unsorted array...so we assume that 1 element is sorted
public class insertionsort {
    static void sort(int arr[]) {
    for(int i = 1; i < arr.length; i++){
        int current = arr[i];
        int j = i - 1;
        while (j >= 0 && current < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }
        //placement
        arr[j + 1] = current;
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num = input.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        sort(arr);
        for(int element : arr)
        {
            System.out.println(element);
        }
    }
}