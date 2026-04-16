import java.util.*;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("\nMaximum element: " + max);

        sc.close();
    }
}
