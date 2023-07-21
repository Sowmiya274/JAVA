import java.util.*;
class countchar{
     public static void main(String[] args) {
String str = "abbcccddddeeeee";
int count = 1;
char prevChar = str.charAt(0);
for (int i = 1; i < str.length(); i++) {
char currentChar = str.charAt(i);
if (currentChar == prevChar) {
count++;
} else {
System.out.print(count);
count = 1;
prevChar = currentChar;
}
}
System.out.print(count);
}
}