import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=input.nextInt(); 
        long fact=  factorial(num);
        System.out.println("print factorial :" + fact);
    }
    public static long factorial(int num){
        if(num<0){
            System.out.println("number is invalid");
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}