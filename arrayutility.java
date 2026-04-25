import java.util.Scanner;
public class arrayutility{
    public static int[][] input2Darray() {
         Scanner input =  new Scanner(System.in);
        System.out.print("please enter the number of rows: " );
        int rows = input.nextInt();
        System.out.print("please enter the number of columns: ");
        int columns = input.nextInt();
        int[][] numarray = new int[rows][columns];
        int i = 0 ;
        while(i< rows){
            int j = 0;
            while(j< columns){
                System.out.print("pleas enter element row:" + (i+1) +" columns: " + (j+1) + " : " );
               numarray[i][j] = input.nextInt();
               j++; 
            }
            i++;
        }


        //int[] nums = new int[size];
        /*int i = 0;
        while(i<size){
            System.out.print("please enter the element in array" + (i+1) +" : " );
            nums[i] = input.nextInt();
            i++;*/
        
           return numarray;
    }

    

    public static void displayArray(int[] numArray){
        int i= 0;
        while(i< numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println ();
    }
}
