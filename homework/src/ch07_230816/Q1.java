package ch07_230816;

public class Q1 {
	// Q1. �� ���� ���� x,y,z�� �޾Ƽ� �߰� ũ���� ���� ��ȯ�ϴ� mid��� �޼��� �ۼ��Ͻÿ�. 
	// ���� ���� ���� �غ��� !
	static int mid2(int x, int y, int z) {
		if(x>y) {
			if(z>x) {
				return x;
			}
			else if(y>z) {
				return y;
			}
			else {
				return z;
			}
		}
		else { // x<=y
				if(z<x) {
					return x;
				}
				else if(y<z) {
					return y;
				}
				else { return z; }
		}
	}
	static int mid(int x, int y, int z) {
		int[] tmp = {x, y, z};
		for(int i=0; i<tmp.length-1; i++) {
			for(int j=0; j<tmp.length-1-i; j++) { // -i : ���� ����
				if(tmp[i]>tmp[i+1]) {
					int tt = tmp[i];
					tmp[i] = tmp[i+1];
					tmp[i+1] = tt;
				}
			}
		}
//		System.out.println(Arrays.toString(tmp));
		return tmp[1];
	}

	public static void main(String[] args) {
		//mid2
		System.out.println(mid2(5, 1, 4));
		
		//mid
		System.out.println(mid(2, 1, 4));
	}

}
