package test;

import beans.Producto;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        actualizarProducto(2, "Panel Solar Monocristalino"); //Prueba de actualizacion de datos de la DB
        listarProductos();

    }

    public static void actualizarProducto(int id_producto, String tipo) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE producto SET tipo = '" + tipo + "' WHERE id_producto =" + id_producto; // Con mayuscula para identificar que es una Sentencia SQL 
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void listarProductos() {

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM producto"; // Con mayuscula para identificar que es una Sentencia SQL 
        try { //Casos de errores
            Statement st = con.getConnection().createStatement();//Conexion
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                int id_producto = rs.getInt("id_producto");
                String tipo = rs.getString("tipo");
                String vatios = rs.getString("vatios");
                String voltaje = rs.getString("voltaje");
                int cantidad = rs.getInt("cantidad");
                int valor = rs.getInt("valor");
                


                Producto productos = new Producto(id_producto, tipo, vatios, voltaje, cantidad, valor);
                System.out.println(productos.toString());
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

}
