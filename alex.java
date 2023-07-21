import java.util.*;
class alexsocks{
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(socks(9, arr));
    }

    static int socks(int n, int[] ar) {
        int pairs = 0;
        int Array[] = new int[ar.length];
        int Temp =1;
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                    Array[j] = Temp;
                }
            }
            if (Array[i]!= Temp) {
                Array[i] = count;
            }
        }

        for (int i = 0; i < Array.length; i++) {
            if (Array[i]!=Temp) {
                int divide =Array[i] / 2;
                pairs += divide;
            }
        }
        return pairs;
    }
}
