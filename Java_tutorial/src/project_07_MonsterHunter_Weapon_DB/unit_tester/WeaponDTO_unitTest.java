package project_07_MonsterHunter_Weapon_DB.unit_tester;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponDTO;

public class WeaponDTO_unitTest {
	private static WeaponDTO dto;
	
	public static void main(String[] args) {
		dto = new WeaponDTO();
		
		testSet();
		testGet();
	}

// DTO setter 테스트
	private static void testSet() {
		System.out.println("----- WeaponDTO set Test -----");
		
		System.out.print("\n\t1.name 입력 테스트 : 멸혼의 흉기");
		dto.setName("멸혼의 흉기");
		
		System.out.print("\n\t2.sort 입력 테스트 : 대검");
		dto.setSort("대검");
		
		System.out.print("\n\t3.damage 입력 테스트 : 1008");
		dto.setDamage(1008);
		
		System.out.print("\n\t4.critical 입력 테스트 : 0");
		dto.setCritical(0);
		
		
		System.out.print("\n\t5.grade 입력 테스트 : 8");
		dto.setGrade(8);
		
		System.out.print("\n\t6.attribute 입력 테스트 : 용");
		dto.setAttribute("용");
		
		System.out.print("\n\t7.attribute_val 입력 테스트 : 150");
		dto.setAttributeVal(150);
		
		System.out.print("\n\t8.slot_1 입력 테스트 : 1");
		dto.setSlot_1(1);
		
		System.out.print("\n\t9.slot_2 입력 테스트 : 0");
		dto.setSlot_2(0);
		
		System.out.print("\n\t10.slot_3 입력 테스트 : 0");
		dto.setSlot_3(0);
		
		System.out.print("\n\t11.material 입력 테스트 : 명등룡의 유각x2, 멸진용의 큰뿔x5, 멸진룡의 첨예발톱x5, 멸진용의 보옥x1");
		dto.setMaterial("명등룡의 유각x2, 멸진용의 큰뿔x5, 멸진룡의 첨예발톱x5, 멸진용의 보옥x1");
		
		System.out.print("\n\t12.tree 입력 테스트 : 네르기간테");
		dto.setTree("네르기간테");
		
		System.out.print("\n\t13.curTreeNo 입력 테스트 : 9");
		dto.setCurTreeNo(9);
		
		System.out.print("\n\t14.sharpness_1 입력 테스트 : 20");
		dto.setSharpness_1(20);
		
		System.out.print("\n\t15.sharpness_2 입력 테스트 : 30");
		dto.setSharpness_2(30);

		System.out.print("\n\t16.sharpness_3 입력 테스트 : 10");
		dto.setSharpness_3(10);
		
		System.out.print("\n\t17.sharpness_4 입력 테스트 : 15");
		dto.setSharpness_4(15);
		
		System.out.print("\n\t18.sharpness_5 입력 테스트 : 20");
		dto.setSharpness_5(20);
		
		System.out.print("\n\t19.sharpness_6 입력 테스트 : 0");
		dto.setSharpness_6(0);
		
		System.out.println("\n----- set Test 종료 -----\n\n");
	}
	
	
// DTO getter 테스트
	public static void testGet() {
		System.out.println("----- WeaponDTO get Test -----");
		System.out.println("\n\t1.dto.getName()\n\t\t: " + dto.getName());
		System.out.println("\n\t2.dto.getSort()\n\t\t: " + dto.getSort());
		System.out.println("\n\t3.dto.getDamange()\n\t\t: " + dto.getDamage());
		System.out.println("\n\t4.dto.getCritical()\n\t\t: " + dto.getCritical());
		System.out.println("\n\t5.dto.getGrade()\n\t\t: " + dto.getGrade());
		System.out.println("\n\t6.dto.getAttribute()\n\t\t: " + dto.getAttribute());
		System.out.println("\n\t7.dto.getAttributeVal()\n\t\t: " + dto.getAttributeVal());
		System.out.println("\n\t8.dto.getSlot_1()\n\t\t: " + dto.getSlot_1());
		System.out.println("\n\t9.dto.getSlot_2()\n\t\t: " + dto.getSlot_2());
		System.out.println("\n\t10.dto.getSlot_3()\n\t\t: " + dto.getSlot_3());
		System.out.println("\n\t11.dto.getMaterial()\n\t\t: " + dto.getMaterial());
		System.out.println("\n\t12.dto.getTree()\n\t\t: " + dto.getTree());
		System.out.println("\n\t13.dto.getCurTreeNo()\n\t\t: " + dto.getCurTreeNo());
		System.out.println("\n\t14.dto.getSharpness_1()\n\t\t: " + dto.getSharpness_1());
		System.out.println("\n\t15.dto.getSharpness_2()\n\t\t: " + dto.getSharpness_2());
		System.out.println("\n\t16.dto.getSharpness_3()\n\t\t: " + dto.getSharpness_3());
		System.out.println("\n\t17.dto.getSharpness_4()\n\t\t: " + dto.getSharpness_4());
		System.out.println("\n\t18.dto.getSharpness_5()\n\t\t: " + dto.getSharpness_5());
		System.out.println("\n\t19.dto.getSharpness_6()\n\t\t: " + dto.getSharpness_6());
		
		System.out.println("\n----- get Test 종료 -----");
	}
}
