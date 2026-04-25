import java.util.Scanner;
public class oddsum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
        int sum=oddsum(num);
       System.out.println("print odd sum :" +sum);
    }
    public static int oddsum(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
           // System.out.print("print odd sum :" +sum);
            i+=2;
        }
        return sum;

    }
}