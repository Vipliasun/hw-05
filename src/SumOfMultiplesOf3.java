public class SumOfMultiplesOf3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 20; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of numbers from 20 to 100 that are divisible by 3 is: " + sum);
    }
}


