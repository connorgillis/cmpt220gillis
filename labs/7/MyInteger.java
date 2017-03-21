public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    //return getter
    public int getValue() {
        return value;
    }

    //return if even
    public boolean isEven() {
        return isEven(value);
    }

    //return if false
    public boolean isOdd() {
        return isOdd(value);
    }

    //return if prime
    public boolean isPrime() {
        return isPrime(value);
    }

    //return if even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    //retrun odd
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }


    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    //return if value == value
    public boolean equals(int value) {
        return this.value == value;
    }

    //return class version (testing for equality)
    public boolean equals(MyInteger myInteger) {
        return myInteger.value == this.value;
    }




}