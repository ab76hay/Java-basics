import java.util.Scanner;
public class fibonacciRecursion {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        int count = input.nextInt();
        for(int i =1; i<=count; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int position){
        System.out.print(".");
        if(position == 1) {
            return 0;
        }
        if(position == 2) {
            return 1;
        }

      //  return fibonacci(position:position - 1) + fibonacci(position:position - 2);
        return 0;
    }

}
