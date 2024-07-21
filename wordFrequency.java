import java.util.Scanner;

public class wordFrequency {
    public static void main(String[] args) {
    
        @SuppressWarnings("resource")
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int count = 1;

        for(int i = 0 ; i<str.length();i++){
            if((str.charAt(i) == ' ' ) && (str.charAt(i+1)!= ' ')){
                count = count+1;
            }
        }
        System.out.println("the number of words in gthe given string is : " + count);
    }
}

