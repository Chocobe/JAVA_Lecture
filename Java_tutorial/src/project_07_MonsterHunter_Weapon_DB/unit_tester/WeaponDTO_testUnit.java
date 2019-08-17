package project_07_MonsterHunter_Weapon_DB.unit_tester;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.IWeaponsDTO;

public class WeaponDTO_testUnit implements IWeaponsDTO {
	private String name;
	private String sort;
	private int damage;
	private int critical;
	private int grade;
	private String attribute;
	private int attribute_val;
	private int slot_1;
	private int slot_2;
	private int slot_3;
	private int num_of_slot;
	private String material;
	private String tree;
	private int tree_position;
	private int sharpness_1;
	private int sharpness_2;
	private int sharpness_3;
	private int sharpness_4;
	private int sharpness_5;
	private int sharpness_6;
	
	
// 입력값 검사용 테스트 메인
//	public static void main(String[] args) {
//		WeaponDTO_testUnit test = new WeaponDTO_testUnit();  
//		test.testSetAllData();
//		test.testPrint();
//	}
	

// DTO setter 테스트
	public void testSetAllData() {
		
		this.setAllData("멸혼의 흉기", "대검", 1008, 0, 
				8, "용", 150, 1, 0, 0, 1,
				"명등룡의 유각x2, 멸진용의 큰뿔x5, 멸진룡의 첨예발톱x5, 멸진용의 보옥x1", 
				"네르기간테", 9, 20, 30, 10, 15, 20, 0);
		
		System.out.println("----- setAllData Test -----");
		
		System.out.print("\n\t1.setName(멸혼의 흉기)\n");
		
		System.out.print("\n\t2.setSort(대검)\n");
		
		System.out.print("\n\t3.setDamage(1008)\n");
		
		System.out.print("\n\t4.setCritical(0)\n");
		
		System.out.print("\n\t5.setGrade(8)\n");
		
		System.out.print("\n\t6.setAttribute(용)\n");
		
		System.out.print("\n\t7.setAttribute_val(150)\n");
		
		System.out.print("\n\t8.setSlot_1(1)\n");
		
		System.out.print("\n\t9.setSlot_2(0)\n");
		
		System.out.print("\n\t10.setSlot_3(0)\n");
		
		System.out.print("\n\t11.setNumOfSlot(1)\n");
		
		System.out.print("\n\t12.setMaterial(명등룡의 유각x2, 멸진용의 큰뿔x5, 멸진룡의 첨예발톱x5, 멸진용의 보옥x1)\n");
		
		System.out.print("\n\t13.setTree(네르기간테)\n");
		
		System.out.print("\n\t14.setTree_position(9)\n");
		
		System.out.print("\n\t15.setSharpness_1(20)\n");
		
		System.out.print("\n\t16.setSharpness_2(30)\n");

		System.out.print("\n\t17.setSharpness_3(10)\n");
		
		System.out.print("\n\t18.setSharpness_4(15)\n");
		
		System.out.print("\n\t19.setSharpness_5(20)\n");
		
		System.out.print("\n\t20.setSharpness_6(0)\n");
		
		System.out.println("\n\n----- set Test 종료 -----\n\n");
	}
	
	
// DTO getter 테스트
	public void testPrint() {
		
		System.out.println("----- WeaponDTO getter Test -----");
		
		System.out.println("\n\t1.this.getName()\n\t\t: " + this.name);
		
		System.out.println("\n\t2.this.getSort()\n\t\t: " + this.sort);
		
		System.out.println("\n\t3.this.getDamange()\n\t\t: " + this.damage);
		
		System.out.println("\n\t4.this.getCritical()\n\t\t: " + this.critical);
		
		System.out.println("\n\t5.this.getGrade()\n\t\t: " + this.grade);
		
		System.out.println("\n\t6.this.getAttribute()\n\t\t: " + this.attribute);
		
		System.out.println("\n\t7.this.getAttributeVal()\n\t\t: " + this.attribute_val);
		
		System.out.println("\n\t8.this.getSlot_1()\n\t\t: " + this.slot_1);
		
		System.out.println("\n\t9.this.getSlot_2()\n\t\t: " + this.slot_2);
		
		System.out.println("\n\t10.this.getSlot_3()\n\t\t: " + this.slot_3);
		
		System.out.println("\n\t11.this.getNumOfSlot()\n\t\t: " + this.num_of_slot);
		
		System.out.println("\n\t12.this.getMaterial()\n\t\t: " + this.material);
		
		System.out.println("\n\t13.this.getTree()\n\t\t: " + this.tree);
		
		System.out.println("\n\t14.this.getCurTreeNo()\n\t\t: " + this.tree_position);
		
		System.out.println("\n\t15.this.getSharpness_1()\n\t\t: " + this.sharpness_1);
		
		System.out.println("\n\t16.this.getSharpness_2()\n\t\t: " + this.sharpness_2);
		
		System.out.println("\n\t17.this.getSharpness_3()\n\t\t: " + this.sharpness_3);
		
		System.out.println("\n\t18.this.getSharpness_4()\n\t\t: " + this.sharpness_4);
		
		System.out.println("\n\t19.this.getSharpness_5()\n\t\t: " + this.sharpness_5);
		
		System.out.println("\n\t20.this.getSharpness_6()\n\t\t: " + this.sharpness_6);
		
		System.out.println("\n----- get Test 종료 -----");
	}
	

	public void setAllData(String name, String sort, int damage, int critical, int grade, String attribute,
					int attribute_val, int slot_1, int slot_2, int slot_3, int num_of_slot, String material, String tree, int tree_position,
					int sharpness_1, int sharpness_2, int sharpness_3, int sharpness_4, int sharpness_5, int sharpness_6) {
		this.name = name;
		this.sort = sort;
		this.damage = damage;
		this.critical = critical;
		this.grade = grade;
		
		this.attribute = attribute;
		this.attribute_val = attribute_val;
		
		this.slot_1 = slot_1;
		this.slot_2 = slot_2;
		this.slot_3 = slot_3;
		this.num_of_slot = num_of_slot;
		
		this.material = material;
		
		this.tree = tree;
		this.tree_position = tree_position;
		
		this.sharpness_1 = sharpness_1;
		this.sharpness_2 = sharpness_2;
		this.sharpness_3 = sharpness_3;
		this.sharpness_4 = sharpness_4;
		this.sharpness_5 = sharpness_5;
		this.sharpness_6 = sharpness_6;
	}
}
