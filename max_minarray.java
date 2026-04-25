//import java.util.Scanner;
public class max_minarray{
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find max min value in array: ");
        int[] numArr = arrayutility.inputarray();
        int min = min(numArr);
        int max = max(numArr);
        System.out.println("max value of the array is: " + max);
        System.out.println("min value of the array is: "+ min);

    }
    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i<numArr.length){
            if(min> numArr[i]){
                min = numArr[i];
            }
            i++;
        }

        return min;
    }
    public static int max(int[] numArr){
        if(numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while(i< numArr.length){
            if(max< numArr[i]){
                max = numArr[i];
            }
        i++;
        }
        return max;
    }
}