import java.util.Scanner;
public class prime_number{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number =input.nextInt();
       // int prime = prime(number);
        //System.out.println("");
    
    //public static int prime(int number){
        int i=2;
        while(i<number){
            if(number % i==0){
                System.out.println("number is not prime");
            }else{
                System.out.println("number is prime");
            }
        i++;
        }
    
    }
}