/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel_Alura;

/**
 *
 * @author walterquijada
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    // Configura los detalles de la conexión
   // Configura los detalles de la conexión
    private static String url = "jdbc:mysql://localhost:3307/hotel";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String username = "root";
    private static String password = "loidateamo";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // Maneja la excepción, por ejemplo:
                System.out.println("Error al crear la conexión a la base de datos.");
            }
        } catch (ClassNotFoundException ex) {
            // Maneja la excepción, por ejemplo:
            System.out.println("Driver no encontrado.");
        }
        return con;
    }
}

