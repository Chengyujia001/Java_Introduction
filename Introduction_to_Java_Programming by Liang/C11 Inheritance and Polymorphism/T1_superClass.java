package C11;

import java.util.Date;

public class T1_superClass {
	private String color = "white";
	private boolean filled;
	private java.util.Date date; //time
	
	public T1_superClass() {
		date = new java.util.Date();
	}
	
	public T1_superClass(String color, boolean filled) {
		date = new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getData() {
		return "The color is " + getColor() + " ";
	}
	
	public void printCircle() {
		System.out.print("No info");
	}

	public static void main(String[] args) {
		T1_superClass a = new T1_superClass("Blue",true);
		System.out.print(a.getData());
		
	}


}

