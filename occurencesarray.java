import java.util.Scanner;
public class occurencesarray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array occurences");
        int[] numArr = arrayutility.inputarray();
        System.out.print("now enter the number you want to search: ");
        int num = input.nextInt();
        int occurences = noOfOccurences(numArr,num);
        System.out.println("your element was found" + occurences + "times in array");

    }
    public static int noOfOccurences(int[] numArr,int num){
        int occ = 0;
        int i = 0;
        while(i<numArr.length){
            if(numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ ;
    }
}