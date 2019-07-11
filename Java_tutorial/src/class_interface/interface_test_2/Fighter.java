package class_interface.interface_test_2;

public class Fighter extends Unit implements IFighterable {

	@Override
	public void move(int _x, int _y) {
		System.out.println(_x + ", " + _y + "로 이동합니다.");
	}

	@Override
	public void attack(Unit _unit) {
		System.out.println("Hp가 " + _unit.current_hp + "이고 " + _unit.x + ", " + _unit.y + "에 있는 유닛을 공격합니다.");
	}
	
}
