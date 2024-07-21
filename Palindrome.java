import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string you want to check for palindrome:");
        String str = scan.next();
        scan.close();
        System.out.println("checking for palindrome");

        String revString = "";
        
        for(int i = (str.length()-1); i>=0 ;i--){
            revString = revString + str.charAt(i);
        }

        System.out.println(""); 
        

        if(revString.equals(str)){
            System.out.println("The String "+str+ " is palindrome");
        }
        else{
            System.out.println("The String "+str+ " is not palindrome");
        }
    }
}
