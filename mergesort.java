import java.util.*;

public class mergesort {

    static void merge(int arr[],int start, int mid , int end)
    {
        int merged[] = new int[end - start + 1];
        int idx1 = start; // for 1 array
        int idx2 = mid + 1; // for 2 array
        int x = 0; // for merged array
        while(idx1<=mid && idx2 <= end)
        {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            merged[x++] = arr[idx1++];
        }
        while(idx2<= end)
        {
            merged[x++] = arr[idx2++];
        }
        
        for(int i = 0, j = start; i < merged.length; i++,j++)
        {
            arr[j] = merged[i];
        }
    }

    static void partition(int arr[],int start, int end)
    {
        if (start < end) {
            int mid = (start + end) / 2;
            partition(arr, start, mid);
            partition(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        else {
            return;
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
        partition(arr, 0, num -1 );
        for(int i = 0; i < num; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
