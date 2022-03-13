package edu.rpg.monster;
import edu.rpg.battle.BattlePattern;
import edu.rpg.element.ElementType;

public abstract class Monster {
	private String name;
	private int hp;
	private int attackPower;
	private int exp;
	public Monster(String name,int hp,int attackPower,int exp) {
		this.name = name;
		this.hp = hp;
		this.attackPower = attackPower;
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackPower(int attackPower) {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public abstract BattlePattern getBattlePatten

}
