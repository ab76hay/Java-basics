public class merge_array{
    public static void main(String[] args) {
        System.out.println("welcome to the merge array: ");
        int[] arr1= arrayutility.inputarray();
        int[] arr2 = arrayutility.inputarray();
        int[] mergedarr = merge(arr1,arr2);
        System.out.println("your merged array is: ");
        arrayutility.displayArray(mergedarr);
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int newsize = arr1.length + arr2.length;
        int[] newarr = new int[newsize];
        int i = 0,j = 0,k = 0;
        while(i<arr1.length || j< arr2.length){
            if(j == arr2.length||
            (i< arr1.length && arr1[i]< arr2[j])){
                newarr[k]= arr1[i];
                i++;
                k++;
            } else {
                newarr[k] = arr2[j];
                k++;
                j++;
            }
        }


        return newarr;
    }
}