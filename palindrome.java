public class palindrome{
    public static void main(String[] args) {
        System.out.println("welcome to array palindrome: ");
        int[] numArr = arrayutility.inputarray();
        boolean isPalin = isPalindrome(numArr);
        if(isPalin){
            System.out.println("your array is palinrome");
            
        }else{
            System.out.println("your array is not palindrome");
        }
    }
    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while(i<numArr.length/2){
            if(numArr[i]!= numArr[numArr.length-1 - i]){
                return false;
            }
            i++;
        }
        return true;
        
    }
    
}