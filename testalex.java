import java.util.*;
class alex{
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println( socks(9, arr));

    }

    static int socks(int n, int[] arr) {
        int pairs = 0;
        int[] ar = new int[arr.length];
        int Temp = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                    ar[j] = Temp;
                }
            }
            if (ar[i] != Temp) {
               ar[i] = count;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (ar[i] != Temp) {
                int divide = ar[i] / 2;
                pairs += divide;
            }
        }
        return pairs;
    }
}
