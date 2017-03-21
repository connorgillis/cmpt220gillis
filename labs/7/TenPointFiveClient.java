import java.util.Scanner;

public class TenPointFiveClient {
    public static void main(String[] args) {
        //initialize scanner
        Scanner input = new Scanner(System.in);

        //store input as number
        System.out.print("Enter a positive integer: ");
        int value = input.nextInt();

        //using stack class functionallity,
        System.out.print("The smallest factors of " + value + " are: ");
        //create stack object
        StackOfIntegers stack = new StackOfIntegers();

        smallestFactors(value, stack);
        //input value given for smallestfactors method

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }


    public static void smallestFactors(int number, StackOfIntegers stack) {
        int i = 2;
        while (number / i != 1){
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            }
            else
                i++;
        }
        stack.push(number);
    }
}