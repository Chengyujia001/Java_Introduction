package C9;

public class runTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Televation tv1 = new Televation();
		 tv1.setChanel(3);
		 System.out.println("the channel is " + tv1.channel);
		 
		 
		 Televation tv2 = new Televation(25);
		 System.out.print("the channel is " + tv2.channel);
		
	}

}
