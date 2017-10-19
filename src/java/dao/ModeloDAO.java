
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Esquema;
import model.ModeloNavegacion;
import util.DbUtil;

public class ModeloDAO {
     private Connection connection;

    public ModeloDAO() {
        connection = DbUtil.getConnection();
    }

    public void addModelo(ModeloNavegacion modelo) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into modelo_navegacion(nombre_modelo) values (?)");
        preparedStatement.setString(1, modelo.nombre_modelo);
        preparedStatement.executeUpdate();
    }

    public void deleteModelo(int id_modelo) throws SQLException {
        
        PreparedStatement rs = connection.prepareStatement("select * from tabla where id_modelo=?");
        rs.setInt(1, id_modelo);
        ResultSet rt=rs.executeQuery();
        ContextoDAO cd=new ContextoDAO();
        while (rt.next()) {
            cd.deleteContexto(rt.getInt("id_modelo"));
        }
        PreparedStatement preparedStatement = connection.prepareStatement("delete from modelo_navegacion where id_modelo=?");
        preparedStatement.setInt(1, id_modelo);
        preparedStatement.executeUpdate();
    }

    public void updateModelo(String modelo,int idE) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update modelo_navegacion set nombre_modelo=?" + " where id_modelo=?");
        preparedStatement.setString(1, modelo);
        preparedStatement.setInt(2, idE);
        
        preparedStatement.executeUpdate();
    }

    public ArrayList<ModeloNavegacion> getAllModelos() throws SQLException {
        ArrayList<ModeloNavegacion> modelos = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from modelo_navegacion");
        while (rs.next()) {
            ModeloNavegacion modelo = new ModeloNavegacion(rs.getInt("id_modelo"), rs.getString("nombre_modelo"));
            modelos.add(modelo);
        }
        return modelos;
    }

    public ModeloNavegacion getModeloById(int id_modelo) throws SQLException {
        ModeloNavegacion modelo = new ModeloNavegacion();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from modelo_navegacion where id_modelo=?");
        preparedStatement.setInt(1, id_modelo);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            modelo.id_modelo=rs.getInt("id_esquema");
            modelo.nombre_modelo= rs.getString("nombre_esquema");
        }
        return modelo;
    }   
    
}
