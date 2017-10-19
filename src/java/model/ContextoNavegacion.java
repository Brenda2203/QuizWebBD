
package model;

public class ContextoNavegacion {
    public int id_contexto;
    public String link;
    public String nombre_contexto;
    public int id_modelo;
    
    public ContextoNavegacion(){
        
    }

    public ContextoNavegacion(String link, String nombre_contexto, int id_modelo) {
        this.link = link;
        this.nombre_contexto = nombre_contexto;
        this.id_modelo = id_modelo;
    }
    
    @Override
    public String toString() {
        return "ContextoNavegacion{" + "id_contexto=" + id_contexto + ", link=" + link + ", nombre_contexto=" + nombre_contexto + ", id_modelo=" + id_modelo + '}';
    }
}
