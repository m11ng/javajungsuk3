package ch11_230825;

import java.util.Arrays;

public class MyVector {
	
	Object[] objArr;
//	Object[] objArr = null;
	int capacity = 0;
	int size = 0;

	// capacity�� size�� length�� ������????
	
	// �Ű����� �ִ� ������
	MyVector (int capacity){
		if(capacity < 0) {
			throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�. : " + capacity);
		}
		this.capacity = capacity;
		
		// ��ü �迭�� �ʱ�ȭ �������
		objArr = new Object[capacity];
	}
	
	// �⺻������
	MyVector () {
		this(16);
	}
	
	int size() { return size; }
	
	// �迭 objArr�� ���̸� ��ȯ�ϴ� capacity() �����
	int capacity() {
		return objArr.length; // ������ ��ȯ�ص� �ǳ�...
	}
	boolean isEmpty() {
		return size == 0;
	}
	
	// Q2-4 ��ü�迭 objArr�� ��ü�� �߰��ϴ� �޼��带 �ۼ��Ͻÿ�
	void add(Object obj) {
		if(size == capacity) {
			Object[] tmp = new Object[capacity*2];
			System.arraycopy(objArr, 0, tmp, 0, size);
			objArr = tmp;
			this.capacity = capacity;
		}
		objArr[size] = obj;
		size++;
	}
	
	Object get(int index) {
		if(0>index || index>=size) { // �ε����� 0���� �����ϴϱ�. size-1�� �ε����� ��������. �׷��� size�� �ε����� ������ ���� �������.
			throw new IndexOutOfBoundsException("������ ���� �����ϴ�.");
		}
		return objArr[index];

	}
	
	public String toString() {
		String str = "";
		for(int i=0; i<objArr.length; i++) {
			str += "" + objArr[i] + ",";
		}
		return str;
	}
	
	// objArr���� ������ ��ü�� ����Ǿ� �ִ� ��ġ�� ��ȯ�ϴ� int indexOf(Object obj)�� �ۼ��Ͻÿ�
	/*
	public int indexOf(Object obj) {
		// �� ��ü�� ����ε����� �ִ� �ֶ� ��� ������
		
	}
	*/
	public static void main(String[] args) {

		MyVector v = new MyVector(10);
		
		for(int i=0; i<v.objArr.length; i++) {
			v.objArr[i] = (int)(Math.random()*5+1);
		}
		System.out.println(Arrays.toString(v.objArr));
		System.out.println(v.toString());
	}

}
