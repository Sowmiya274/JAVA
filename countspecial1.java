import java.util.*;
class countspecial1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch =str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z'||ch[i] >= 'a' && ch[i] <= 'z'){
				continue; 
			}
            else if(ch[i]>= '0' && ch[i] <= '9'){
                continue;
            }
            else {
                count++;
        }
		}
		System.out.print(count);
		}
	}