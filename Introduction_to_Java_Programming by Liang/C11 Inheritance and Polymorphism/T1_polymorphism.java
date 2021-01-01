package C11;

public class T1_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(new T1_subClass());
		

	}
	
	
	public static void show(T1_subClass a) {
		System.out.print("create date: "+ a.getDate() + "\nThe color is: " + a.getColor()); 
				
	}

}
