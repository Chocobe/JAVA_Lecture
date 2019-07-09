package generic_collection.collections_class;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections_ex {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("트랜스포머");
		list.add("스타워즈");
		list.add("매트릭스");
		list.add(0, "터미네이터");
		list.add(2, "아바타");
		
		print_list(list);
		
		Collections.sort(list);
		print_list(list);
		
		Collections.reverse(list);
		print_list(list);
		
		int search_idx = Collections.binarySearch(list, "아바타") + 1;
		System.out.println("매트릭스는  " + search_idx + "번째 요소이다.");
	}
	
	
	public static void print_list(LinkedList<String> _list) {
		Iterator<String> iterator = _list.iterator();
		
		while(iterator.hasNext()) {
			String data = iterator.next();
			String seperator = "";
			
			if(iterator.hasNext()) {
				seperator = " -> ";
				
			} else {
				seperator = "\n";
			}
			
			System.out.print(data + seperator);
		}
	}
	
	
	public static void print_line() {
		System.out.println("\n-----------------------------------\n");
	}
}
