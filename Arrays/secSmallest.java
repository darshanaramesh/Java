package Arrays;

import java.util.*;

public class secSmallest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            if(arr[i]<small){
                second_small = small;
                small = arr[i];
            }
            else if(arr[i] < second_small && arr[i]!=small){
                second_small = arr[i];
            }
        }
        System.out.print(second_small);
	}
}


