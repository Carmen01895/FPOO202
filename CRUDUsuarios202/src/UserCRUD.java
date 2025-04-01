/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Microsoft Windows 11
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
   
    private Connection conexion;
    
    public UserCRUD (){
        conexion = ConexionMySQL.conectar();
    } //Constructor
    
    public boolean crearUsuario (String nombre, String correo, String contrasena){
        
        String sqlInsert = "INSERT INTO Usuarios(nombre,correo,contrasena) VALUE (?,?,?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);  
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al intentar Insertar: " + e.getMessage());
            return false;
        }  
    }//Metodo
    
    public ResultSet obtenerUsuarioPorID(int id){
        
        String selectSQL = "SELECT * FROM Usuarios WHERE id = ?";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
                    ps.setInt(1, id);
                    return ps.executeQuery();
        } catch(SQLException e){
            System.out.println("Error al intentar Consultar: " + e.getMessage());
            return null;
        }  //Metodo
        
    }
    
    public ResultSet obtenerTodos(){
        String sqlTodos = "SELECT * FROM Usuarios";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
                    return ps.executeQuery();
        }catch(SQLException w){
            System.out.println("Error al consultar" + w.getMessage());
            return null;
        }
    }//Obtener Todos
    
    public boolean ActualizarNombre(String id, String nombre){
        String sqlActualizarN = "UPDATE Usuarios SET nombre = ? WHERE id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlActualizarN);
            ps.setString(1, nombre);
            ps.setString (2,id);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al intentar Actualizar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean ActualizarCorreo (String id, String correo){
        String sqlActualizarE = "UPDATE Usuarios SET correo = ? WHERE id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlActualizarE);
            ps.setString(1, correo); 
            ps.setString(2, id);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al intentar Actualizar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean ActualizarContrasena (String id, String contrasena){
        String sqlActualizarE = "UPDATE Usuarios SET contrasena = ? WHERE id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlActualizarE);
            ps.setString(1, contrasena); 
             ps.setString(2, id);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al intentar Actualizar: " + e.getMessage());
            return false;
        }
    }
    
}
