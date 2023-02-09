package ClasesCopias;

public class TestSimpleCat {
	
	public static void main(String[] args) { 
		SimpleCat garfield = new SimpleCat("macho"); 
		System.out.println("hello kitty"); 
		garfield.meow(); 
		System.out.println("take pie"); 
		garfield.eat("black forest pie"); 
		System.out.println("take fish, see if you like this"); 
		garfield.eat("fish"); 
		SimpleCat tom = new SimpleCat("male"); 
		System.out.println("Tom, have some vegetable soup"); 
		tom.eat("vegetable soup"); 
		SimpleCat lisa = new SimpleCat("female"); 
		SimpleCat smooth = new SimpleCat("male");
		System.out.println("kittens, let's see how you meow"); 
		garfield.meow(); 
		tom.meow(); 
		smooth.meow(); 
		garfield.fightWith(lisa); 
		smooth.fightWith(tom); 
		tom.fightWith(garfield); 
		}
}
