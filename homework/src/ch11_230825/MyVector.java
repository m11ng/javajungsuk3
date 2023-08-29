package ch11_230825;

import java.util.Arrays;

public class MyVector {
	
	Object[] objArr;
//	Object[] objArr = null;
	int capacity = 0;
	int size = 0;

	// capacity와 size와 length의 차이점????
	
	// 매개변수 있는 생성자
	MyVector (int capacity){
		if(capacity < 0) {
			throw new IllegalArgumentException("유효하지 않은 값입니다. : " + capacity);
		}
		this.capacity = capacity;
		
		// 객체 배열도 초기화 해줘야지
		objArr = new Object[capacity];
	}
	
	// 기본생성자
	MyVector () {
		this(16);
	}
	
	int size() { return size; }
	
	// 배열 objArr의 길이를 반환하는 capacity() 만들기
	int capacity() {
		return objArr.length; // 렝스로 반환해도 되나...
	}
	boolean isEmpty() {
		return size == 0;
	}
	
	// Q2-4 객체배열 objArr에 객체를 추가하는 메서드를 작성하시오
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
		if(0>index || index>=size) { // 인덱스는 0부터 시작하니까. size-1이 인덱스의 마지막임. 그래서 size와 인덱스랑 같으면 범위 벗어난거임.
			throw new IndexOutOfBoundsException("범위를 벗어 났습니다.");
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
	
	// objArr에서 지정된 객체가 저장되어 있는 위치를 반환하는 int indexOf(Object obj)를 작성하시오
	/*
	public int indexOf(Object obj) {
		// 이 객체랑 몇번인덱스에 있는 애랑 어떻게 비교할지
		
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
