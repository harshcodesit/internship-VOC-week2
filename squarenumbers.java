import java.util.*;

public class squarenumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int el = sc.nextInt();
        System.out.println("");
        System.out.println("enter the numbers");
        for(int i = 0; i<el ; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("then list of numbers is"+list);

        for(int i = 0; i<el ; i++){
            int num = list.get(i);
            int square = num * num;
            list.set(i, square);
        }

        System.out.println("then list of square of numbers is"+list);
    }
}
