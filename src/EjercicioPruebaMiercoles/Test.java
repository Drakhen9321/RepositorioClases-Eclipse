package EjercicioPruebaMiercoles;

import java.util.Scanner;

public class Test {
	 public static void MuestraMayorDeEdad(Persona p) {
	       System.out.println("Jorge ha estado aquí");
	       System.out.println(p.esMayorDeEdad());
	    }
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el nombre");
        String nombre = sc.next();
        
        System.out.println("Introduce la edad");
        String texto = sc.next();
        int edad = Integer.parseInt(texto);
 
        System.out.println("Introduce el sexo");
        texto = sc.next();
        char sexo = texto.charAt(0);
 
        System.out.println("Introduce el peso");
        texto = sc.next();
        double peso = Double.parseDouble(texto);
 
        System.out.println("Introduce la altura");
        texto = sc.next();
        double altura = Double.parseDouble(texto);
 
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
 
     
        persona1.setNombre("Jesus");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
 
        
        System.out.println("Persona1");
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
 
        System.out.println("Persona2");
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
        System.out.println(persona1.esMayorDeEdad());
    }
 
    
    
 
}
