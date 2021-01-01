package C11;


public class This_and_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Dog d = new Dog();
	    d.eatThis();
	    d.eatSuper();
	}

}

class Animal {
	  void eat() {
	    System.out.println("animal : eat");
	  }
	}
	 
class Dog extends Animal {
	void eat() {
		System.out.println("dog : eat");
	  }
	void eatThis() {
		this.eat();   // !
	  }
	void eatSuper() {
		super.eat();  // !
	}
	}
	 

