import java.util.*;

public class bubblesort2
{
    public static void bubbleSort(int[] arr,int n){
        if(n==1) return;
        boolean swap = false;
        for(int j = 0; j <= n-2;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap = true;
            }
        }
        if(!swap) return;
        bubbleSort(arr,n-1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
	}
}