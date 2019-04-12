
public class Character {
	private String name;
	private Weapon weapon;
	private int hitPoints;
	
	public Character(String name, Weapon weapon, int hitPoints) {
		this.name = name;
		this.weapon = weapon;
		this.hitPoints = hitPoints;
	}
	
	public void attack(Character target) {
		int damageCaused = weapon.getDamage();
		target.hitPoints -= damageCaused;
		System.out.println(name + " attacks " + target.getName() + " with " + weapon.getName() + ", causing " + damageCaused + " damage.");
		if(target.hitPoints <= 0) {
			System.out.println(target.getName() + " dropped to " + target.hitPoints + " health. " + name + " has won!");
		} else {
			System.out.println(target.getName() + " has " + target.hitPoints + " health remaining.");
		}
		
	}
	
	public String getName() {
		return name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

}
