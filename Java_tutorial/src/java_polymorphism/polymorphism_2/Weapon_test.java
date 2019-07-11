package java_polymorphism.polymorphism_2;

public class Weapon_test {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 공격력 : " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포 공격력 : " + weapon.fire());
	}
}
