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
		
		// set�̶� ������ �����ϱ�.
		// list ������ �Ἥ ������ ����� �ش����� �̾ƿ;���.
		Collection<String> coo = new LinkedHashSet<>(co);
		Iterator listIt = coo.iterator();
		System.out.println();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		// �ٵ� 0��° ���� �̾ƿ���......
		System.out.println(listIt);
		
	}
	
	
	
	
	
	
	
	
}