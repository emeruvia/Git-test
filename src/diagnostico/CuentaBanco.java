
package diagnostico;

public class CuentaBanco {
    
    private Animal a;
    private Dueño d;
    private Veterinario v;
    private int numero;


    public CuentaBanco(Animal a, Dueño d, Veterinario v, int numero) {
        this.a = a;
        this.d = d;
        this.v = v;
        this.numero = numero;
    }
//    public CuentaBanco(){
//        a = new Animal("Canino","Omnivoro",5522,"Fifi");
//        d = new Dueño("Andres","Arispe",23,9334005);
//        v = new Veterinario("Maikol","Godoy",22,665544);
//    }
    
    public void mostrarCuenta(){
        System.out.println("Nombre del dueño: "+d.getNombre()+
                "\nApellido del dueño: "+d.getApellido()+
                "\nCI del dueño: "+d.getCi()+
                "\nNombre del veterinario: "+v.getNombre()+
                "\nApellido del veterinario: "+v.getApellido()+
                "\nCI del veterinario: "+v.getCi()+
                "\nNombre del animal: "+a.getNombre()+
                "\nEspecie del animal: "+a.getEspecie()+
                "\nAlimentacion del animal: "+a.getAlimentacion()+
                "\nCodigo del animal: "+a.getCodigo()+
                "\nCodigo del banco: "+numero);
    }
}
