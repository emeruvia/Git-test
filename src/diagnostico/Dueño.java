/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

/**
 *
 * @author Pingocho
 */
public class Dueño extends Persona {

    public Dueño(String nombre, String apellido, int edad, int ci){
        super(nombre, apellido, edad, ci);
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+ getNombre()+
                "\nApellido: "+getApellido()+
                "\nedad: "+getEdad()+
                "\nCI: "+getCi()+
                "\nOficio: "+"Dueño");
    }
    
}
