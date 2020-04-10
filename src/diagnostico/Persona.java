/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int ci;
    
    public Persona(String nombre, String apellido, int edad, int ci){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCi() {
        return ci;
    }
    
    
    
    
    
}
