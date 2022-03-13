package edu.rpg.monster;
import edu.rpg.battle.BattlePattern;
public class Bat extends Monster{
	public Bat() {
		super("",300,50,30);
	}
	public BattlePattern getBattlePattern() {
		return BattlePattern.ROOP;
	}

}
