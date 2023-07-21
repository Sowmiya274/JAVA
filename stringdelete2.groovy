
import java.util.Scanner;

class TestClass {

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner(System.in);

int test = sc.nextInt();

sc.nextLine();

while(test>0){

String name = sc.nextLine();

String tag = "";

for(int i=0;i<name.length()-1;i++){

if(name.charAt(i) != name.charAt(i+1))

tag = tag + name.charAt(i);

}

tag = tag + name.charAt(name.length()-1);

System.out.println(tag);

test--;

}

}

}