import java.util.Scanner;
public class delete_newarray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array deletion: ");
        int[] numArr = arrayutility.inputarray();
        System.out.print("now enter tha number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deletenumber(numArr,numToDelete);
        System.out.println("Here is your new Array");
        arrayutility.displayArray(newArr);

    }
    public static int[]  deletenumber(int[] numArr, int numToDelete){
        int occ = occurencesarray.noOfOccurences(numArr,numToDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length-occ;
        int[] newArr  = new int[newSize];
        int i = 0,j = 0;
        while(j< numArr.length){
            if(numArr[i]!=numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;

    }
}