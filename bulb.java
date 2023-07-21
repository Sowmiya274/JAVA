import java.util.*;
class bulb {
    public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
		int[] arr =new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
		int n= arr.length;
		System.out.print(btimes(arr,n));
	}
	 public static int btimes(int[] arr, int n)
	{
		int count = 0;
		for (int i = 0; i<n; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
				for (int j = i + 1; j<n; j++) {
					if (arr[j] == 1) {
						System.out.println();
					}
					else {
						arr[j] = 1;
					}
				}
				count++;
			}
		}
		return count;
	}
	
}

