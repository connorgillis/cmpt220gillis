public class TenPointThreeClient {
    public static void main(String[] args) {
        //create test array
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("Testing isEven(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
        }

        System.out.println("Testing isOdd(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
        }

        System.out.println("Testing isPrime(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
        }

        System.out.println("Testing isEven():");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isEven());
        }

        System.out.println("Test isOdd():");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isOdd());
        }

        System.out.println("Test isPrime():");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isPrime());
        }

        System.out.println("Test isEven(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isEven(value));
        }

        System.out.println("\nTest if values are odd using isOdd(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
        }

        System.out.println("Testing isPrime(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
        }

        int[] equalityValues = {5, 9, 7};
        MyInteger value = new MyInteger(9);
        System.out.println("Testing value.getValue()");
        for (int i = 0; i < equalityValues.length; i++) {
            System.out.println(equalityValues[i] + " " + value.equals(equalityValues[i]));
        }

        System.out.println("Testing value.getValue()");
        for (int i = 0; i < equalityValues.length; i++) {
            MyInteger myInteger = new MyInteger(equalityValues[i]);
            System.out.println(equalityValues[i] + " " + value.equals(myInteger));
        }

        System.out.println("Testing parseInt(char[])");

        //create test array
        char[] charsToInts = {'7', '8', '9'};

        //create test string
        String stringToInt = "658";

        System.out.print("");
        for (int i = 0; i < charsToInts.length; i++) {
            System.out.print(charsToInts[i]);
        }


    }
}