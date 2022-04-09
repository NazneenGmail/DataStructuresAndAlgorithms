public class ValidPalindrome {

    public void isValidPalindrome(String s) {
        boolean flag = true;
        String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("\"" + newS + "\"");
        int f=0, l=newS.length()-1;
        while (l>=f) {
            if(newS.charAt(f) == newS.charAt(l)) {
                f++;
                l--;
            }
            else {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("\"" + s + "\""+  " is Valid Palindrome");
        else
            System.out.println("\"" + s + "\"" + " is Not Valid Palindrome");
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();

        String s1 = "abc cba";
        vp.isValidPalindrome(s1);
        String s2 = "abc";
        vp.isValidPalindrome(s2);
        String s3 = "A man, a plan, a canal: Panama";
        vp.isValidPalindrome(s3);
        String s4 = "race a car";
        vp.isValidPalindrome(s4);
        String s5 = " ";
        vp.isValidPalindrome(s5);
    }
}