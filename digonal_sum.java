public class digonal_sum {
    public static void main(String[] args) {
        System.out.println("welcome to the sum of diagonal: ");
        int[][] numArr = arrayutility.input2Darray();
        long sum = sumOfdigonal(numArr);
        System.out.println("sum of digonal is: " + sum);

    }
    public static long sumOfdigonal(int[][] numArr){
        long leftsum = sumOfleftdigonal(numArr);
        long rightsum = sumOfrightdigonal(numArr);
        long sum = leftsum +rightsum;
        if(numArr.length%2 !=0){
            int ind = numArr.length/2;
        }
        return sum;
    }
    public static long sumOfleftdigonal(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i< numArr.length){
            sum = sum + numArr[i][i];
        i++;
            }
        return sum ;
    }
    public static long sumOfrightdigonal(int[][] numArr){
        long sum = 0;
        int i =0;
        while(i< numArr.length){
            int col = numArr.length -1 -i;
            sum+=numArr[i][col];
            i++;
        }        return sum;
    }
    
}
