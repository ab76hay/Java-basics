import java.util.Scanner;
public class oddevenbitwise{
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("Please enter a number :" );
        int number=input.nextInt();
        if((number&1)==1){
        System.out.println("number is odd");
        } else{
            System.out.println(" number iss even");
        }
        
    }

    }
