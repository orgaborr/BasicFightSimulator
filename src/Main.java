
public class Main {

	public static void main(String[] args) {
		Weapon axe = new Weapon(2, 6, "axe");
		Character player1 = new Character("Grom", axe, 20);
		
		Weapon sword = new Weapon(3, 10, "sword");
		Character player2 = new Character("Izzy", sword, 15);
		
		while(player1.getHitPoints() > 0 || player2.getHitPoints() > 0) {
			player1.attack(player2);
			if(player2.getHitPoints() <= 0) {
				break;
			}
			player2.attack(player1);
			System.out.println();
			if(player1.getHitPoints() <= 0 ) {
				break;
			}
		}

	}

}
