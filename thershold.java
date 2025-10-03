import java.util.*;
public class thershold {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
        }
        int thershold = sc.nextInt();
        System.out.println(displayCount(arr,thershold));
    }
    static int displayCount(int[]arr,int thershold) {
        int count = 0;
        for (int term : arr) {
            count += term / thershold + ((term % thershold == 0) ? 0 : 1);
        }
        return count;
    }
}
