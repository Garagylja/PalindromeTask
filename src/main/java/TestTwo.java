import static java.lang.System.out;

/**
 * Created by Garagulya on 29.10.2015.
 *
 * 993 * 913  count of iterarion 681
 Palindrome = 906609
 */
public class TestTwo {
/*We compare the first and poseledny sign including the second and penultimate, etc.
 count - an ordinary counter. Find out how many pairs among each other are equal.
  if the count is the number of elements that compare
*
* */
	public static boolean isPalindrome (int num) {
		int l = String.valueOf (num).length (); //take the length of which is obtained by multiplying
		String strnumber = String.valueOf (num);
		int k = 0, count = 0;
		for (; k < l / 2; k++)
			if (strnumber.charAt (k) == strnumber.charAt (l - k - 1))
				count++;
		if (count == k) {return true;}
		return false;
	}
/*
This method iterates through the possible values of a palindrome in two cycles of the maximum possible.
To test calls the isPalindrome (int) that interrupts the cycle in the first match
 */
	public static int serchPalindrome () {
		int res = 0;
		int i,j,count=0;
		for (i = 999 ; i > 900; i--) {
			for ( j = 999;j>900;j--){
			res = i * j;
				count++;
			if (isPalindrome (res)) {
				out.println (" "+i+" * "+j+"  count of iterarion " + count+" ");
				return res;}
		}
		}
		return 0;
	}



	public static void main (String[] args) {
		out.println ("Palindrome = " + serchPalindrome ());
	}
}
