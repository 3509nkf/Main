package edu.rpg.answer.second;

public class InnRunner {

	public static void main(String[] args) {
		Inn inn = new Inn("町の宿屋","500");
		System.out.println("ここは" + inn.getInnName() + "です。");
		inn.stay("新人");

	}

}
