//import java.util.Scanner;
//public class BubbleSort {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for (int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        for (int i =0; i<n-1; i++){
//            for(int j=0; j<n-1-i; j++){
//                if(arr[j] < arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}
import java.util.*;

public class BubbleSort{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter s2: ");
        String s2 = sc.nextLine();

        boolean answer = true;

        if (s1.length() >s2.length()) {
                    answer = false;
            int[] count1 = new int[26];
            int[] count2 = new int[26];

            // s1 ka frequency
            for (char ch : s1.toCharArray()) {
                count1[ch - 'a']++;
            }

            int k = s1.length();

            for (int i = 0; i < s2.length(); i++) {

                // Character add
                count2[s2.charAt(i) - 'a']++;

                // Window size maintain
                if (i >= k) {
                    count2[s2.charAt(i - k) - 'a']--;
                }

                // Check permutation
                if (i >= k - 1 && Arrays.equals(count1, count2)) {
                    answer = true;
                    break;
                }
            }
        }

        System.out.println("Answer = " + answer);
    }
}
