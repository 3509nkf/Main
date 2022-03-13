package edu.rpg.answer.second;

public class Character {
	private String name;
	private String gender;
	private Weapon weapon;
	/**HP*/
	private int hp;
	/**MP*/
	private int power;
	private int exp;
	private int level;
	public Character(String name, String gender) {
		this.name = name;
		this.gender = gender;
		this.exp = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getAttackPower() {
		return weapon.getPower() + this.power;
	}
	

}
