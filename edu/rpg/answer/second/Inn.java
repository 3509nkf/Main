package edu.rpg.answer.second;

public class Inn {
	public String innName;
	public String price;
	public Inn(String innName, String price) {
		this.innName = innName;
		this.price = price;
	}
	public String getInnName() {
		return innName;
	}
	public void stay(String visitorName) {
		System.out.println("ようこそ"+ visitorName + "様。一泊" + price + "円です");
	}

}
