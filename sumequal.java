import java.util.*;
class sumequal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Target:");
		int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        int flag=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]+arr[j]==target) {
        			flag=1;
        		}
        	}
        }
        if(flag==1) {
        	System.out.print("True");
        }
        else {
        	System.out.print("False");
        }

	}

}