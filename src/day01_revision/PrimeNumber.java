package day01_revision;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(PrimeNumber(7));


    }

    public static boolean PrimeNumber(int number){
        boolean result = true;
        double limit = Math.ceil(number/2);
        for (int i = 2; i < limit; i++) {
            if (number % i == 0){
                result = false;
            }
        }
        return result;
    }
}
