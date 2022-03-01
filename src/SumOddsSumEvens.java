public class SumOddsSumEvens {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] % 2 ==0){
                evenSum = evenSum + arr1[i];
            }else{
                oddSum = oddSum + arr1[i];
            }
        }
        System.out.println("The sum of the evens is: " + evenSum);
        System.out.println("The sum of the odds is: " + oddSum);

    }
}
