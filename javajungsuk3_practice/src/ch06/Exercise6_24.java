package ch06;

public class Exercise6_24 {
	static int abs(int value) {
		//�־��� ���� ���밪�� ��ȯ�Ѵ�.
		return Math.abs(value);
	}
	
	static int abs2(int value) {
		if(value>=0) {
			return value;
		}
		else {
			return -value;
		}
	}
	
	public static void main(String[] args) {
		int value=5;
		System.out.println(value+"�� ���밪 : "+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪: "+abs(value));
		
	}

}
