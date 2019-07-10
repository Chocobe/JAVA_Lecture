package generic_collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		String input_string = "";
			
		for(int i = 0; i < 4; i++) {
			System.out.print("문자열 입력 : ");
			input_string = scanner.nextLine();
			
			list.add(input_string);
		}
		
		print_longest(list);
		
		scanner.close();
	}
	
	
	// 가장 긴 이름 출력하기
	public static void print_longest(ArrayList<String> _list) {
		int longest_idx = 0;
		
		for(int i = 0; i < _list.size(); i++) {
			if(_list.get(longest_idx).length() < _list.get(i).length()) {
				longest_idx = i;
			}
		}
		
		System.out.println("가장 긴 문자열 : " + _list.get(longest_idx));
	}
}
