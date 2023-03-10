package OOP;

public class Ejercicio {
    
    public static void main(String[] args){

        Persona persona = new Persona();
        persona.setEdad(18);
        persona.setNombre("Dennis");
        persona.setTelefono("0978746787"); // ECU +593 (ECUADOR)

        System.out.println("[*] Usuario: " + persona.getNombre());
        System.out.println("[*] Edad: " + persona.getEdad());
        System.out.println("[*] Telefono: " + persona.getTelefono());
    }
}

/*
 *Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola
 */


class Persona{

    private int edad;
    private String nombre;
    private String telefono;

    //Edad...
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    //Nombre...
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    //Telefono...
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}