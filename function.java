import java.util.Scanner;
public class function{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the function program");
        System.out.print("please enter the number: ");
        int number= input.nextInt();
       int a=odd_even(number);
       System.out.println("prnit number"+a);
    }
     public static int odd_even(int number){
        if(number/2!=0){
            System.out.println("number is odd");
        }else{
            System.out.println("number is even");
        }
        
    } 

    
    
}
