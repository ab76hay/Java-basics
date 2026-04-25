import java.util.Scanner;
public class sumofdigit{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a digit :");
        int digit=input.nextInt();
        int sum=sumofdigit(digit);
         System.out.println("The sum of digit is : " +sum);
    }
    public static int sumofdigit(int digit){
        int sum=0;
        while(digit>0){
            sum=sum+(digit%10);
            digit=digit/10;

        }

        return sum;
    }
}