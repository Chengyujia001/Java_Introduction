package C9;

public class Televation {

	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	//directly use '''''boolean on;'''''  is okay, default value if false.
	
	public Televation() {	
	}
	
	public Televation(int a) {
		channel = a;
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void setChanel(int newChannel) {
		channel = newChannel;
	}

}

