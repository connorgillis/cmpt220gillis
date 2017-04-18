//define class Problem12dot7
public class Problem12dot7 {
    //define method bin2Dec
    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int decimal = 0;
        //iterate over binaryString
        //let i be 0
        //let j be the length of binaryString array
        //j will represent the place value aka 2^j
        for (int i = 0, j = binaryString.length() - 1;
             i < binaryString.length(); i++, j--) {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
                //throw exception NumberFormatException if char != 0||1
                throw new NumberFormatException("The input is not a binary string");
            //return decimal value from binary string
            decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
        }
        //return decimal value
        return decimal;
    }
}