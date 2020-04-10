
package diagnostico;

public class Animal {
    
    private final String especie;
    private final String nombre;
    private final String alimentacion; 
    private int codigo;

    public Animal(String especie, String alimentacion, int codigo, String nombre) {
        this.especie = especie;
        this.alimentacion = alimentacion;
        this.codigo = codigo;
        this.nombre = nombre;
        
    }

    public String getEspecie() {
        return especie;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void mostrarDatos(){
        System.out.println("Especie: "+ getEspecie()+
                "\nAlimentacion: "+getAlimentacion()+
                "\nCodigo: "+getCodigo()+
                "\nNombre: "+getNombre());
    }
    
    
}
