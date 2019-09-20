package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Persona p = new Persona();
	    System.out.println("Introduzca un nombre");
	    p.setNombre(sc.nextLine());
	    System.out.println("Introduzca unos apellidos");
	    p.setApellidos(sc.nextLine());
	    
	    try {
	    	System.out.println("Introduzca una edad");
		    p.setEdad(sc.nextInt());
        } catch (Exception e) {
        	System.out.println("Edad incorrecta");
        } 
	    
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    String json = gson.toJson(p);
	    System.out.println(json);
	    
	    //System.out.println(p.toString());
	}

}
