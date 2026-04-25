public class sum_avg{
    public static void main(String[] args) {
        System.out.println("welcome to the sum and average in array: ");
        int[][] nums = arrayutility.input2Darray();
       // long sum = sum(numarr);
      //  double avg = average(numarr);
      //  System.out.println("your average of array is:" + avg);
       // System.out.println("your sum of array is " + sum);

    }
    public static long sum(int[][] numarr ){
        long sum = 0;
        int i = 0;
        while(i<numarr.length){
            int j = 0;
            while(j<numarr.length){
                sum +=numarr[i][j];
                j++;
            }
            i++;
        }
        return 0;
    }
    public static double average(int[][] numarr){
        if(numarr.length == 0){
            return 0 ;
        }
        int rows = numarr.length;
        int column = numarr[0].length;
        double size = rows*column;
        return sum(numarr)/size;
        /*  double avg = 0;
        int i = 0;
        while(i<numarr.length){
            int j = 0;
            while(j<numarr.length){
                avg = sum/numarr[i][j];
                j++;
            }
            i++; */
            
        }
       // return 0;
    }
