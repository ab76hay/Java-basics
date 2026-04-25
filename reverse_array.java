import java.util.Scanner;
public class reverse_array{
    public static void main(String[] args) {
        System.out.println("welcome to reverse array: ");
        int[] numArr = arrayutility.inputarray();
        reverse(numArr);
        System.out.println("Your reversed array is: ");
        arrayutility.displayArray(numArr);


    }
    public static void reverse(int[] arr){
        int i = 0; 
        while(i< arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length -1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}