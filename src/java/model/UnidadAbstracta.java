
package model;

public class UnidadAbstracta {
    public int id_unidad;
    public String nombre_unidad;
    public int id_contexto;
    public int id_tabla;
    
    public UnidadAbstracta(){
        
    }

    public UnidadAbstracta(String nombre_unidad, int id_contexto, int id_tabla) {
        this.nombre_unidad = nombre_unidad;
        this.id_contexto = id_contexto;
        this.id_tabla = id_tabla;
    }

    @Override
    public String toString() {
        return "UnidadAbstracta{" + "id_unidad=" + id_unidad + ", nombre_unidad=" + nombre_unidad + ", id_contexto=" + id_contexto + ", id_tabla=" + id_tabla + '}';
    }
        
}
