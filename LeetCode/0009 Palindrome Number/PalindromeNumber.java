public class PalindromeNumber {
    public void display(boolean flag, int num) {
        if(flag)
            System.out.println("\"" + num + "\""+  " is Valid Palindrome");
        else
            System.out.println("\"" + num + "\"" + " is Not Valid Palindrome");
    }
    public boolean isPalindromeNumber(int num) {
        if(num < 0)
            return false;
        int div = 1;
        while ((num/div) >= 10) {
            div *= 10;
        }
        while (num != 0) {
            int l = num / div;
            int r = num % 10;

            if(l != r) {
                return false;
            }

            num = (num % div) / 10;
            div /= 100;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        int num1 = 121;
        pn.display(pn.isPalindromeNumber(num1), num1);

        int num2 = 1221;
        pn.display(pn.isPalindromeNumber(num2), num2);

        int num3 = 123;
        pn.display(pn.isPalindromeNumber(num3), num3);

        int num4 = 12321;
        pn.display(pn.isPalindromeNumber(num4), num4);
    }
}