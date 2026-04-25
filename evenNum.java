import java.util.Scanner;
public class evenNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of num for executing loop: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
