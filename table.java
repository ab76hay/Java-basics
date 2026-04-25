 import java.util.Scanner;
 public class table{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for printing table :");
        int number=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println("Print the table : " +number*i);
            i++;
        }
    }
}