public class sumOfPositive {
    public static void main(String[] args) {
        System.out.println("welcome to the adding positive numbers");
        int[] arr = {4,5,6,7,-2,-5,6,9,1,};
        int sum = 0;
        for(int num : arr){
            if( num< 0){
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive number is: " + sum);
    }
}
