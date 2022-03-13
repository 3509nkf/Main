
public abstract class Weapon {
	private String weaponName;
	private WeaponType weaponType;
	public Weapon(WeaponType weaponType, String weaponName) {
		this.weaponType = weaponType;
		this.weaponName = weaponName;
	}
	public String getWeaponName() {
		return this.weaponName;
	}
	public WeaponType getWeaponType() {
		return this.weaponType;
	}
	public abstract int getPower();
	
}
