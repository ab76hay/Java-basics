import java.util.Scanner;
public class reverse_digit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num =input.nextInt();
        int reversedigit =reversedigit(num);
        System.out.println("the reverse digit is: " + reversedigit);

    }
    public static int reversedigit(int num){
        int newnum =0;
        while(num>0){
        int digit = num % 10;
         newnum = newnum*10 + digit;
        num/=10;
            }
        

        return newnum;
    }
}