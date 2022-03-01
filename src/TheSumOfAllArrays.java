public class TheSumOfAllArrays {


    public static int sumAll(){
        int sum = 0;
        int sumArray[] = {5, 2, 3, 1};

        for (int n : sumArray){
            sum += n;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(sumAll());
    }
}


