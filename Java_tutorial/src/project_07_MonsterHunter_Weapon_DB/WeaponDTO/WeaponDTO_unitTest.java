package project_07_MonsterHunter_Weapon_DB.WeaponDTO;

import java.util.Scanner;

public class WeaponDTO_unitTest {
	private static WeaponDTO dto;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		dto = new WeaponDTO();
		
		testInsert(scanner);
		testSelect();
	}
	
	private static void testInsert(Scanner _sc) {
		System.out.println("----- WeaponDTO Insert Test -----");
		System.out.println(">> \"blank\" 입력시, 공백문자 입력");
		
		System.out.print("\n\t1.name 입력 테스트 : ");
		dto.setName(_sc.nextLine());
		
		System.out.print("\n\t2.sort 입력 테스트 : ");
		dto.setSort(_sc.nextLine());
		
		System.out.print("\n\t3.damage 입력 테스트 : ");
		dto.setDamage(_sc.nextInt());
		
		System.out.print("\n\t4.critical 입력 테스트 : ");
		dto.setCritical(_sc.nextInt());
		
		
		System.out.print("\n\t5.grade 입력 테스트 : ");
		dto.setGrade(_sc.nextInt());
		_sc.nextLine();
		
		System.out.print("\n\t6.attribute 입력 테스트 : ");
		dto.setAttribute(_sc.nextLine());
		
		System.out.print("\n\t7.attribute_val 입력 테스트 : ");
		dto.setAttributeVal(_sc.nextInt());
		
		System.out.print("\n\t8.slot_1 입력 테스트 : ");
		dto.setSlot_1(_sc.nextInt());
		
		System.out.print("\n\t9.slot_2 입력 테스트 : ");
		dto.setSlot_2(_sc.nextInt());
		
		System.out.print("\n\t10.slot_3 입력 테스트 : ");
		dto.setSlot_3(_sc.nextInt());
		_sc.nextLine();
		
		System.out.print("\n\t11.material 입력 테스트 : ");
		dto.setMaterial(_sc.nextLine());
		
		System.out.print("\n\t12.tree 입력 테스트 : ");
		dto.setTree(_sc.nextLine());
		
		System.out.print("\n\t13.curTreeNo 입력 테스트 : ");
		dto.setCurTreeNo(_sc.nextInt());
		
		System.out.print("\n\t14.sharpness_1 입력 테스트 : ");
		dto.setSharpness_1(_sc.nextInt());
		
		System.out.print("\n\t14.sharpness_2 입력 테스트 : ");
		dto.setSharpness_2(_sc.nextInt());
		
		System.out.print("\n\t14.sharpness_3 입력 테스트 : ");
		dto.setSharpness_3(_sc.nextInt());
		
		System.out.print("\n\t14.sharpness_4 입력 테스트 : ");
		dto.setSharpness_4(_sc.nextInt());
		
		System.out.print("\n\t14.sharpness_5 입력 테스트 : ");
		dto.setSharpness_5(_sc.nextInt());
		
		System.out.print("\n\t14.sharpness_6 입력 테스트 : ");
		dto.setSharpness_6(_sc.nextInt());
		
		System.out.println("Insert Test 종료");
	}
	
	
	public static void testSelect() {
		System.out.println("----- WeaponDTO Select Test -----\n");
		System.out.println("\t1.dto.getName() : " + dto.getName());
		System.out.println("\t2.dto.getSort() : " + dto.getSort());
		System.out.println("\t3.dto.getDamange() : " + dto.getDamange());
		System.out.println("\t4.dto.getCritical : " + dto.getCritical());
		System.out.println("\t5.dto.getGrade() : " + dto.getGrade());
		System.out.println("\t6.dto.getAttribute() : " + dto.getAttribute());
		System.out.println("\t7.dto.getAttributeVal() : " + dto.getAttributeVal());
		System.out.println("\t8.dto.getSlot_1() : " + dto.getSlot_1());
		System.out.println("\t9.dto.getSlot_2() : " + dto.getSlot_2());
		System.out.println("\t10.dto.getSlot_3() : " + dto.getSlot_3());
		System.out.println("\t11.dto.getMaterial() : " + dto.getMaterial());
		System.out.println("\t12.dto.getTree() : " + dto.getTree());
		System.out.println("\t13.dto.getCurTreeNo() : " + dto.getCurTreeNo());
		System.out.println("\t14.dto.getSharpness_1() : " + dto.getSharpness_1());
		System.out.println("\t15.dto.getSharpness_2() : " + dto.getSharpness_2());
		System.out.println("\t16.dto.getSharpness_3() : " + dto.getSharpness_3());
		System.out.println("\t17.dto.getSharpness_4() : " + dto.getSharpness_4());
		System.out.println("\t18.dto.getSharpness_5() : " + dto.getSharpness_5());
		System.out.println("\t29.dto.getSharpness_6() : " + dto.getSharpness_6());
	}
}
