package JavaPractice;

public class Review {
    private double bill;
    private double tipPercentage;

    public static double total(double bill, double tipPercentage) {
        double total;
        total = bill + ((tipPercentage/100) * bill);
        return total;
    }

    private static int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

    public static void even(int[] nums){
        int[] evens;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }

        }
    }




    public static void main(String[] args) {
        System.out.println("total(20.00, 10.0) = " + total(20.00, 10.0));
        even(nums);
    }
}

