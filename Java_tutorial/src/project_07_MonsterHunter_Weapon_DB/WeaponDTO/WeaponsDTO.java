package project_07_MonsterHunter_Weapon_DB.WeaponDTO;

public class WeaponsDTO implements IWeaponsDTO {
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
	private String material;
	private String tree;
	private int tree_position;
	private int sharpness_1;
	private int sharpness_2;
	private int sharpness_3;
	private int sharpness_4;
	private int sharpness_5;
	private int sharpness_6;
	
	@Override
	public void setAllData(
					String name, String sort, int damage, int critical, int grade, 
					String attribute, int attribute_val, 
					int slot_1, int slot_2, int slot_3, 
					String material, 
					String tree, int tree_position,
					int sharpness_1, int sharpness_2, int sharpness_3, 
					int sharpness_4, int sharpness_5, int sharpness_6) {
		setName(name);
		setSort(sort);
		setDamage(damage);
		setCritical(critical);
		setGrade(grade);
		
		setAttribute(attribute);
		setAttribute_val(attribute_val);
		
		setSlot_1(slot_1);
		setSlot_2(slot_2);
		setSlot_3(slot_3);
		
		setMaterial(material);
		
		setTree(tree);
		setTree_position(tree_position);
		
		setSharpness_1(sharpness_1);
		setSharpness_2(sharpness_2);
		setSharpness_3(sharpness_3);
		setSharpness_4(sharpness_4);
		setSharpness_5(sharpness_5);
		setSharpness_6(sharpness_6);
	}
	
// name getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
// sort getter/setter
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
// damage getter/setter
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
// critical getter/setter
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	
// grade getter/setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
// attribute getter/setter
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
// attribute_val getter/setter
	public int getAttribute_val() {
		return attribute_val;
	}
	public void setAttribute_val(int attributVal) {
		this.attribute_val = attributVal;
	}
	
// slot_1 getter/setter
	public int getSlot_1() {
		return slot_1;
	}
	public void setSlot_1(int slot_1) {
		this.slot_1 = slot_1;
	}
	
// slot_2 getter/setter
	public int getSlot_2() {
		return slot_2;
	}
	public void setSlot_2(int slot_2) {
		this.slot_2 = slot_2;
	}
	
// slot_3 getter/setter
	public int getSlot_3() {
		return slot_3;
	}
	public void setSlot_3(int slot_3) {
		this.slot_3 = slot_3;
	}
	
// material getter/setter
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
// tree getter/setter
	public String getTree() {
		return tree;
	}
	public void setTree(String tree) {
		this.tree = tree;
	}
	
// tree_position getter/setter
	public int getTree_position() {
		return tree_position;
	}
	public void setTree_position(int tree_position) {
		this.tree_position = tree_position;
	}
	
// sharpness_1 getter/setter
	public int getSharpness_1() {
		return sharpness_1;
	}
	public void setSharpness_1(int sharpness_1) {
		this.sharpness_1 = sharpness_1;
	}
	
// sharpness_2 getter/setter
	public int getSharpness_2() {
		return sharpness_2;
	}
	public void setSharpness_2(int sharpness_2) {
		this.sharpness_2 = sharpness_2;
	}
	
// sharpness_3 getter/setter
	public int getSharpness_3() {
		return sharpness_3;
	}
	public void setSharpness_3(int sharpness_3) {
		this.sharpness_3 = sharpness_3;
	}
	
// sharpness_4 getter/setter
	public int getSharpness_4() {
		return sharpness_4;
	}
	public void setSharpness_4(int sharpness_4) {
		this.sharpness_4 = sharpness_4;
	}
	
// sharpness_5 getter/setter
	public int getSharpness_5() {
		return sharpness_5;
	}
	public void setSharpness_5(int sharpness_5) {
		this.sharpness_5 = sharpness_5;
	}
	
// sharpness_6 getter/setter
	public int getSharpness_6() {
		return sharpness_6;
	}
	public void setSharpness_6(int sharpness_6) {
		this.sharpness_6 = sharpness_6;
	}
}
