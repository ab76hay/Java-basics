    import java.util.Scanner;
public class simpleintterest{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the value of p :");
        int p=input.nextInt();
        System.out.println("enter the value of R :");
        int R=input.nextInt();
        System.out.println("enter the value of T :");
        int T=input.nextInt();
        float SI=(p*R*T)/100;
        System.out.println("The Simple Interest of :" +SI);
    }
}