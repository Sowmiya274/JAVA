import java.util.*;
class camelcase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sh=sc.nextLine();
        String[] camel=sh.split(" ");
        for(int i=0;i<camel.length;i++){
           /*  if(camel[i].isempty())
           {
                  System.out.println();
           }*/
             if(i == 0 ){
                System.out.print(camel[i].toUpperCase());}
             if(camel[i+1]=="\0"){
                camel[i+1]=camel.toUpperCase(camel[i+1]);
                //System.out.print(camel[i].toUpperCase());
            }
            System.out.print(camel[i]);
            }
        }
    }
    /* 
    import java.util.*;
    class CamelCase {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        String camelCase = toCamelCase(input);
	        System.out.println("Camel case: " + camelCase);
	    }

	    public static String toCamelCase(String input) {
	        String[] words = input.split(" ");
	        StringBuilder result = new StringBuilder();
	        result.append(words[0].toLowerCase());
	        for (int i = 1; i < words.length; i++) {
	            String word = words[i];
	            result.append(word.substring(0, 1).toUpperCase());
	            result.append(word.substring(1).toLowerCase());
	        }
	        return result.toString();
	    }
	}*/