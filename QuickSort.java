import java.util.*;

public class QuickSort {
    public static int partition(int arr[], int low, int high)
    {
        // choose the rightmost element as pivot
        int pivot = arr[high];

        // pointer for greater element
        int i = (low - 1); // track total smallest element ac compared to pivot

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;
                // swapping element at i with element at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        // swapt the pivot element (on correct position ) with the greater element specified by i 
        // i++;
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }
    static void quickSort(int array[], int low, int high) {
        if (low < high) {
    
          // find pivot element such that
          // elements smaller than pivot are on the left
          // elements greater than pivot are on the right
          int pi = partition(array, low, high);
          
          // recursive call on the left of pivot
          quickSort(array, low, pi - 1);
    
          // recursive call on the right of pivot
          quickSort(array, pi + 1, high);
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
        quickSort(arr, 0, num - 1);
        for(int element : arr)
        {
            System.out.println(element);
        }
        
    }
}










// import java.util.*;

// public class QuickSort {
//     static int partition(int arr[],int low , int high)
//     {
//         int pivot = arr[low];
//         int start = low;
//         int end = high;
//         while (start < end)
//         // if st and end does not cross
//         {
//             while (arr[start] <= pivot) {
//                     start++;
//             }
//             while (arr[end] > pivot) {
//                     end--;             
//             }
//             if (start < end) {
//                 int temp = arr[end];
//                 arr[end] = arr[start];
//                 arr[start] = temp;
//             }
//         }
        
//         int temp = arr[low];
//         arr[low] = arr[end];
//         arr[end] = temp;

//         return end;
//     }
//     static void quickSort(int array[], int low, int high) {
//         if (low < high) {
    
//           // find pivot element such that
//           // elements smaller than pivot are on the left
//           // elements greater than pivot are on the right
//           int pi = partition(array, low, high);
          
//           // recursive call on the left of pivot
//           quickSort(array, low, pi - 1);
    
//           // recursive call on the right of pivot
//           quickSort(array, pi + 1, high);
//         }
//       }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the size of the array");
//         int num = input.nextInt();
//         int arr[] = new int[num];
//         System.out.println("Enter elements in the array");
//         for (int i = 0; i < num; i++) {
//             arr[i] = input.nextInt();
//         }
//         input.close();
//         quickSort(arr, 0, num - 1);
//         for(int element : arr)
//         {
//             System.out.println(element);
//         }
        
//     }
// }

