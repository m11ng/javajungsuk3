package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Practice01 {
	
	public static void main(String[] args) {
		Collection<String> co = new HashSet<>();
		co.add("kim");
		co.add("lee");
		co.add("hong");
//		Iterator setIt = co.iterator();
//		
//		while(setIt.hasNext()) {
//			System.out.println(setIt.next());
//		}
		
		// set이라서 순서가 없으니까.
		// list 같은거 써서 순서를 만들어 준다음에 뽑아와야지.
		Collection<String> coo = new LinkedHashSet<>(co);
		Iterator listIt = coo.iterator();
		System.out.println();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		// 근데 0번째 어케 뽑아오지......
		System.out.println(listIt);
		
	}
	
	
	
	
	
	
	
	
}