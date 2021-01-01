package C11;

public class T1_subClass extends T1_superClass{  //extends method
	private double radi;
	private double height;
	private double width;
	
	public T1_subClass() {
	}
	
	public T1_subClass(double radi) {
		this.radi = radi;
	}
	
	public T1_subClass(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	
	public double getRadi(){
		return radi;
	}
	
	public void setRadi(double radi) {
		this.radi=radi;
	}

	public double getCircleArea() {
		return radi*radi*Math.PI;
	}
	
	@Override
	public void printCircle() {
		System.out.print("The circle info:  \n" + getData() + "\nradi is " + getRadi());
	}
	
	@Override
	public String getData() {           //override superclass
		return "The @Override  color is " + getColor() + " ";
	}

	public static String instance(T1_superClass a) {         //instanceof method
		if(a instanceof T1_superClass)
			return "yes";
		else
			return "no";
	}
	
	public static void main(String[] args) {
		T1_superClass a = new T1_subClass(15);
		a.printCircle();
		System.out.print("\nInstance of subclass?: " + instance(a) );
		
	}
}
	
