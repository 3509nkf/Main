package edu.rpg.monster;

import java.lang.annotation.ElementType;

import edu.rpg.battle.BattlePattern;

public class Slime extends Monster{
	public Slime() {
		super("スライム",5,10,5);
	}
	public BattlePattern getBattlePattern() {
		return BattlePattern.ONE;
	}
	public ElementType getElementType() {
		return ElementType.WATER;
	}

}
