package ClasesCopias;

public class TestCube {
	
	public static void main(String[] args) { 
		Cube cube = new Cube(2) ; 
		Cube cubote = new Cube(7); 
		System.out.println("Cube: \n"); 
		Cube ulna = null;
		ulna.paint(); 
		System.out.println("\nCubote: \n"); 
		cubote.paint(); 
		System.out.println("\nI fill the cube: \n"); 
		ulna.fill(); 
		ulna.paint(); 
		System.out.println("\nThe cube is still empty: \n"); 
		cubote.paint(); 
		System.out.println("\nNow I dump what the cube has in the cube.\n"); ulna.dumpInto(cubote); 
		System.out.println("Cube: \n"); 
		ulna.paint(); 
		System.out.println("\nCubote: \n"); 
		cubote.paint(); 
		System.out.println("\nNow I dump what the cube has in the cube.\n"); cubote.dumpInto(cube); 
		System.out.println("Cube: \n"); 
		ulna.paint(); 
		System.out.println("\nCubote: \n"); 
		cubote.paint(); 
		}
}
