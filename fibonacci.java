import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int number = input.nextInt();
        int fibonacci = fibonacci(number);
        //System.out.print("the fibonacci series " );
    

    }
    public static int fibonacci(int number){
        if(number< 0) return 0;
        System.out.print("0 ");
        if(number == 0) return 1;
        System.out.print("1 ");
        int first = 0 , second = 1;
        while(first + second <=number){
            int third = first +  second;
            System.out.print( third + " ");
            first =  second;
            second = third;
            

        }
    
        
      return number;
    }
    
}