package ClasesCopias;

public class SimpleCat {
	
	String color, race, sex; 
	int age; 
	double weight; 
	// methods /////////////////////////////// 
	// constructor 
	SimpleCat (String s) { 
	this.sex = s; 
	} 
	// getter 
	String getSex() { 
	return this.sex; 
	} 
	/** 
	* Makes the cat meow 
	*/ 
	void meow() { 
	System.out.println("Meowuuu"); 
	} 
	/** 
	* Makes the cat purr 
	*/ 
	void purr() { 
	System.out.println("mrrrrrr"); 
	} 
	/** 
	* Makes the cat eat. 
	* Cats like fish, if we give it another food 
	* it will reject it. 
	* 
	* @param food the food offered to the cat 
	*/
	void eat(String food) { 
	if (food.equals("fish")) { 
	System.out.println("Hmmmm, thanks"); 
	} else { 
	System.out.println("Sorry, I only eat fish"); 
	} 
	} 
	/** 
	* Puts two cats to fight. 
	* Only two males will fight each other. 
	* 
	* @param opponent is the cat to fight 
	*/ 
	void fightWith(SimpleCat opponent) { 
	if (this.sex.equals("female")) { 
	System.out.println("I don't like fighting"); 
	} else { 
	if (opponent.getSex().equals("female")) { 
	System.out.println("I don't fight kittens"); 
	} else { 
	System.out.println("come here and you'll find out"); 
	} 
	} 
	}
}
