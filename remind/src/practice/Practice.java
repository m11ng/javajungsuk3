package practice;
import java.util.List;
import java.util.Vector;

public class Practice implements List {
// 이 위로 지우지 말기 !
	Object[] data = null;
	int capacity = 0;
	int size = 0;
	
	public Practice(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("유효하지 않은 값입니다. : "+capacity);
		}
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public Practice() {
		this(10);
	}
	
	public void ensureCapacity(int minCapacity) { // 1
		if(minCapacity - data.length > 0) // 나보다 용량이 큰 애를 데려왔어
			setCapacity(minCapacity); // 그럼 쏏 호출
	}
	
	private void setCapacity(int capacity) { // 나보다 큰애가
		if(this.capacity==capacity) return;
	
		Object[] tmp = new Object[capacity];
		System.arraycopy(data,0, tmp,0,size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public boolean add(Object obj) {
		// 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
		ensureCapacity(size+1);
		data[size++]=obj;
		return true;
	}
	
	public Object get(int index) {
		if(index <0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	public Object remove(int index) {
		Object oldObj = null;
		if(index <0 || index>=size) {
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		}
			
		oldObj = data[index];
		if(index != size-1) {// 마지막 객체 : size-1
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		
		data[size-1]=null;
		size--;
		return oldObj;
	}
	public boolean remove(Object obj) {
		for(int i=0; i<size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity==capacity) return;
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	public void clear() {
		for(int i=0; i<size; i++) {
			data[i] =null;
		size = 0;
		}
	}
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	public boolean isEmpty() { return size==0;}
	public int capacity() {return capacity;}
	public int size() {return size;}

	public boolean cotain(Object o)

}//class































