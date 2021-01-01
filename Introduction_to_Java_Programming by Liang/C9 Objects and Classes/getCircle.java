package C9;

public class getCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetCircle a = new SetCircle();
		SetCircle b = new SetCircle(5);
		
		System.out.printf("circle a: %.2f \ncircle b: %.2f", a.getArea(), b.getArea());
		
	}
	
}


class SetCircle {
	double r = 1;
	double[] location = {0,0};
	  
	SetCircle() {
	}
	
	SetCircle(double newR){
		r = newR;
	}
	
	double getArea() {
		return r*r*Math.PI;
	}
	
	void setRadius(double n) {
		r = n;
	}
	
}