public class NeedleInHaystack {
    String h, n;
    public int strStr(String haystack, String needle) {
        this.h = haystack;
        this.n = needle;
        int nl = needle.length();
        int hl = haystack.length();

        if(nl == 0) {
            return 0;
        } else if( hl == 0 ) {
            return -1;
        } else if (nl > hl) {
            return -1;
        } else {
            for(int i=0; i< (hl + 1 - nl); i++) {
                int temp = i;
                for(int j=0; j < nl; j++) {
                    if(haystack.charAt(temp) == needle.charAt(j))
                    {
                        if(j==(nl-1)) {
                            return i;
                        }
                        temp++;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return -1;
    }
    public void display(int result) {
        if(result == 0) {
            System.out.println(n+" Needle is empty");
        }
        else if(result == -1) {
            System.out.println("Needle is not present in haystack");
        }
        else {
            System.out.println("First occurance of Needle is at position: " + result);
        }
    }
    public static void main(String[] args) {
        NeedleInHaystack needleInHaystack = new NeedleInHaystack();
        needleInHaystack.display(needleInHaystack.strStr("Test", ""));
        needleInHaystack.display(needleInHaystack.strStr("", "1"));
        needleInHaystack.display(needleInHaystack.strStr("abc", "abcd"));
        needleInHaystack.display(needleInHaystack.strStr("hello", "ll"));
        needleInHaystack.display(needleInHaystack.strStr("aaaaa", "bba"));
        needleInHaystack.display(needleInHaystack.strStr("abcabcabcabc", "bc"));
    }
}