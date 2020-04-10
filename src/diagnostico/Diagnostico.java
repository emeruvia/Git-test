/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

public class Diagnostico {
    public static void main(String[] args) {
        Veterinario v1 = new Veterinario("Andres","Arispe",23,1234);
//        v1.mostrarDatos();
        Animal perro = new Animal("Canino","Omnivoro",959595,"Fifi");
//        perro.mostrarDatos();
        Dueño d1 = new Dueño("Mikael","Godoy",22,456789);
//        d1.mostrarDatos();
        CuentaBanco c1 = new CuentaBanco(perro,d1,v1,1);
        c1.mostrarCuenta();
        
    }
    
}
