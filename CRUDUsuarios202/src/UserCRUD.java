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

public class UserCRUD {
   
    private Connection conexion;
    
    public UserCRUD (){
        conexion = ConexionMySQL.conectar();
    }
    
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
    }
    
}
