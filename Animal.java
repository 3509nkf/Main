
public abstract class Animal {
	//色
	public String color;
	//大きさ
	public String size;
	//鳴き声
	private String howlVoice;
	public void howl() {
		//鳴く
		System.out.println(howlVoice);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String  getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public abstract void sleep();

}
