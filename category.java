import java.util.Scanner;
public class category {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the student grade category");
        System.out.print("Please enter the marks: ");
        int marks = input.nextInt();
        String division = marks>=60 ? "First" : (marks>=45 ? "Second" : "Third");
        System.out.println(" the division of student is: "+ division);
    }
}
