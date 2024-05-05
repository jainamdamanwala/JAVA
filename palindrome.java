import java.util.*;  
class Solution {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if(x <= 0 ){
            return false;
        }

        int rev = 0;
        while(x > rev){
            rev = rev * 10 + x % 10;
            x /=10;
            System.out.println(rev);
        }
        return(x == rev) || (x == rev / 10);
    }
}