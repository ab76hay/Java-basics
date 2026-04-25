import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,5,89,98,70,6};
        System.out.println("welcome to Array searching");
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isfound = isfound(arr,num);
        if(isfound){
            System.out.println("the number is found in the array");

        } else{
            System.out.println(" the number is not found in the array");
        }


    }
    public static boolean isfound(int[] arr,int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}