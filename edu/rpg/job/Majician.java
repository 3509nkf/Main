package edu.rpg.job;

public class Majician implements Job,MagicJob{
	public String getJobName() {
		return "魔法使い";
	}
	public String[] getUsableMagics() {
		String[] magics = {"ファイヤー","アイス","ストーム"};
		return magics;
	}

}
