
package model;

public class ModeloNavegacion {
    public int id_modelo;
    public String nombre_modelo;

    public ModeloNavegacion(){
        
    }
    public ModeloNavegacion(String nomnre_contexto) {
        this.nombre_modelo = nomnre_contexto;
    }

    public ModeloNavegacion(int id_modelo, String nombre_modelo) {
        this.id_modelo = id_modelo;
        this.nombre_modelo = nombre_modelo;
    }
    
    @Override
    public String toString() {
        return "ModeloNavegacion{" + "id_modelo=" + id_modelo + ", nomnre_contexto=" + nombre_modelo + '}';
    }

    
    
    
    
}
