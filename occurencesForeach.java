import java.util.Scanner;
public class occurencesForeach {
    public static void main(String[] args) {
       int[] arr = {4,6,8,5,4,7,8,4};
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want to search: ");
        int number = input.nextInt();
        int occ = countOccurences(arr,number);
        System.out.println("your number was found: " + occ + " times");
    }
    public static int countOccurences(int[] arr,int number){
        int occ = 0;
        for(int num: arr){
            if( num == number){
                occ++;
            }
        }
        return occ;

    }
}
