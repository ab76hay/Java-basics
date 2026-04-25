import java.util.Scanner;
public class search_2d{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to search the element in 2D array: ");
        int[][] numarr = arrayutility.input2Darray();
        System.out.print("please enter the element you want to search: ");
        int number = input.nextInt();
        boolean isfound = search(numarr,number);
        if(isfound){
            System.out.println("number is found");
        } else{
            System.out.println("number is not found");
        }

    }
    public static boolean search(int[][] numarr, int number){
        int i = 0;
        while(i<numarr.length){
            int j =0;
            while(j<numarr[i].length){
                if(numarr[i][j] == number){
                    return true;

                }
                j++;

            }
            i++;
        }
        return false;
    }
}