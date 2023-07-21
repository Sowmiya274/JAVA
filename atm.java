class Test{

public static void main(String args[] ) {

 int n=4;

int arr[] = new int[n];

if(n>=1){
}

int a=1;

for(int i=0; i<n-1; i++) {

    if(arr[i] > arr[i+1]) {

        a++;

    }

}

System.out.println(a);

}

}