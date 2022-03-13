package edu.rpg.job;
import edu.rpg.weapon.Weapon;

public interface Job {
	
	int MAX_MASTERY = 99;
	
	
	String getJobName();
	
	Weapon[] getEquipWeapons();

}
