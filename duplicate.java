import java.util.*;
public class Duplicates {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 0, 1, 1, 2, 3, 4, 4, 5};
        int j = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[j] != arr[i]) {
                arr[++j] = arr[i];
            }
        }
        System.out.println(j+1);
    }
}
