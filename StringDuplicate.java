import java.util.*;
public class StringDuplicate {



        public static void reverse(int arr[], int start, int end)
        {
            int temp = 0;

            while(start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        public static void rotateArray(int arr[], int size, int k)
        {
            k = k % size;

            reverse(arr, 0, size - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, size - 1);

        }
        public static void Print(int arr[]){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter elements of array: ");
            for(int i = 0; i < size; i++)
            {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter (k) steps: ");
            int k = sc.nextInt();

            rotateArray(arr, size, k);
            Print(arr);

        }
    }

