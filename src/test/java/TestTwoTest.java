import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by user on 30.10.2015.
 */
public class TestTwoTest extends junit.framework.TestCase {
	int[] testPalindromeArr={12,99,989,133,55,44,878,90909,785,245,11};
	boolean[] testBoolArr={false,true,true,false,true,true,true,true,false,false,true};
	TestTwo palindrome =new TestTwo ();

@Test
	public void test_IsPalindrome()throws Exception{
		for (int i=0;i<testPalindromeArr.length-1;i++){
	assertEquals (testBoolArr[i],palindrome.isPalindrome (testPalindromeArr[i]));
		}
}
}