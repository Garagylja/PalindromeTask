/**
 * Created by user on 29.10.2015.
 */

public class Palindrome {

	long findMax() {
		int n=3;
		//������ ����� ������� n-�������� ����� ���,
		//��� �������� � n-�� ������� 10 � ������� 1.
		long number = (long) Math.pow(10, n) - 1;

		for (long j = number; j > 0; j--) { //���� �������� �� ������ �������� n-��������� �����
			long res = number * j; //������������ ����� ������� n-�������� � ��������� ����� � �����
			int l = String.valueOf(res).length(); //����� ����� �����, ������� �������� � ���������� ���������
			String strnumber = String.valueOf(res); //int ��������� � String
			int k = 0, count = 0;
			for (; k < l / 2; k++)                                               //����������� ���� ��� �����������
				if (strnumber.charAt(k) == strnumber.charAt(l - k - 1)) count++; //���������� ������ � ���������� ���� � �����,
			//������ � ������������� � �.�.
			//count - ������� �������. ������, ������� ��� � ����� ����� ����� �����.
			if (count == k) return Long.parseLong(strnumber);  //���� count ����� ���������� ���������, ������� ����������
		System.out.println(j);
		}
		return 0;
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.findMax());
	}
}