package C11;
import java.util.ArrayList;

public class C11_t2 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		a.add("London");
		a.add("London2");
		a.add("London3");
		a.add("London4");
		a.remove("London");
		
		
	    for (int i = a.size() - 1; i >= 0; i--)
	        System.out.println(a.get(i) + " ");
	      
		
		
		
		
		
		
	}
}


