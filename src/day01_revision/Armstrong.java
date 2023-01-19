package day01_revision;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println(ArmStrongNumber(123));
    }


    public static boolean ArmStrongNumber(int number){


        int firstNumber = number;
        int sum = 0;

        while(number > 0){
            int last = number % 10;
            sum += last * last * last;
            number /= 10;
        }

        return (sum == firstNumber)? true : false;

    }

}
