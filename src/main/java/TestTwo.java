import static java.lang.System.out;

/**
 * Created by user on 29.10.2015.
 */
public class TestTwo {

	public static boolean isPalindrome (int num) {
		int l = String.valueOf (num).length (); //����� ����� �����, ������� �������� � ���������� ���������
		String strnumber = String.valueOf (num);
		int k = 0, count = 0;
		for (; k < l / 2; k++)                                               //����������� ���� ��� �����������
			if (strnumber.charAt (k) == strnumber.charAt (l - k - 1))
				count++;     //���������� ������ � ���������� ���� � �����,
		                     //������ � ������������� � �.�.
							//count - ������� �������. ������, ������� ��� � ����� ����� ����� �����.
		if (count == k) {return true;}  //���� count ����� ���������� ���������, ������� ����������
		return false;
	}

	public static int serchPalindrome () {
		int res = 0;
		int i,j,count=0;
		for (i = 999 ; i > 900; i--) {// ����
			for ( j = 999;j>900;j--){
			res = i * j;
				count++;
			if (isPalindrome (res)) {
				out.println (res+" res | i "+i+" j |"+j+" count " + count);
				return res;}
		}
		}
		System.out.println ();
		return 0;
	}



	public static void main (String[] args) {
		out.println (serchPalindrome ());
	}
}
