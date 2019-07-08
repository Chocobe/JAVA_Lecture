package class_interface.interface_test_2;

public class Fighter_tester {
	public static void main(String[] args) {
		Fighter fighter = new Fighter();
		fighter.move(2, 1);
		fighter.attack(new Unit());
	}
}
