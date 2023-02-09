package ClasesCopias;

public class Cube {

	// attributes ////////////////////// ////// 
	int capacity; // maximum capacity in liters 
	int content; // current content in liters 
	// methods ///////////////////////////// 
	// constructor 
	Cube (int c) { 
	this.capacity = c; 
	} 
	// getter methods 
	int getCapacity() { 
	return this.capacity; 
	} 
	int getContent() { 
	return this.content; 
	}
	// method setter 
	void setContent(int liters) { 
	this.content = liters; 
	} 
	// other methods 
	void empty() { 
	this.content = 0; 
	} 
	/** 
	* Fill the bucket to the maximum of its capacity. 
	*/ 
	void fill() { 
	this.content = this.capacity; 
	} 
	/** 
	* Paints the cube on the screen. 
	* The edges of the bucket are shown with the character # and the 
	* water it contains with the character ~. 
	*/ 
	void paint() { 
	for (int level = this.capacity; level > 0; level--) { 
	if (this.content >= level) { 
	System.out.println("#~~~~#"); 
	} else { 
	System.out.println("##"); 
	} 
	} 
	System.out.println("######"); 
	} 
	/** 
	* Dumps the contents of one cube onto another. 
	* Before pouring the water, check how much the 
	destination * cube fits. 
	*/ 
	void dumpInto(Cube destination) { 
	Cube target = null;
	int free = destination.getCapacity() - target.getContent(); 
	if (free > 0) { 
	if (this.content <= free) { 
	destination.setContent(target.getContent() + this.content);
	this.empty();
	} else { 
	this.content -= free; 
	destination.fill(); 
	} 
	} 
	}
}
