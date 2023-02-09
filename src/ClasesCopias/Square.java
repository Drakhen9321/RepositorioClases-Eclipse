package ClasesCopias;

public class Square {

	int side; 
	public Square(int l) { 
	this.side = l; 
	} 
	public String toString() { 
	int i, spaces; 
	String result = ""; 
	for (i = 0; i < this.side; i++ ) { 
	result += ""; 
	} 
	result += "\n"; 
	for (i = 1; i < this.side - 1; i++) { 
	result += "";
	for (spaces = 1; spaces < this.side - 1; spaces++) { 
	result += " "; 
	} 
	result += "\n"; 
	} 
	for (i = 0; i < this.side; i++ ) { 
	result += ""; 
	} 
	result += "\n"; 
	return result; 
	} 
}
