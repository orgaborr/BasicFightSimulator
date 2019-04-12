
public class Weapon {
	private int damageMin;
	private int damageMax;
	private String name;
	
	public Weapon(int damageMin, int damageMax, String name) {
		this.damageMin = damageMin;
		if(damageMin < 0) {
			this.damageMin = 0;
		}
		this.damageMax = damageMax;
		if(damageMax <= damageMin) {
			damageMax += damageMin - damageMax + 1;
		}
		this.name = name;
	}
	
	private int damage(int damageMin, int damageMax) {
	   int range = (damageMax - damageMin) + 1;     
	   return (int)(Math.random() * range) + damageMin;
	}

	public int getDamage() {
		return damage(damageMin, damageMax);
	}
	
	public String getName() {
		return name;
	}
	
}
