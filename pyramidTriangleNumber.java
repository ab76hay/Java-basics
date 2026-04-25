import java.util.Scanner;
public class pyramidTriangleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int rows = input.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int s = i; s < rows; s++) {
                System.out.print(" ");
            }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + "  ");
                }
                System.out.println();
            }
        }
    }
