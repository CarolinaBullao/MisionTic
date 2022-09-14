
package test;
import beans.Pelicula;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
    actualizarPelicula(2,"terror"); //Prueba de actualizacion de DB
    listarPelicula();
    
    }
public static void actualizarPelicula(int id, String genero){

    DBConnection con= new DBConnection();
    String sql = "UPDATE pelicula SET genero = '" +genero+ "' WHERE id =" + id; // Con mayuscula para identificar que es una Sentencia SQL 
    try {
        Statement st = con.getConnection().createStatement();
        st.executeUpdate(sql);
        
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
    finally{
    con.desconectar();
    }
}

public static void listarPelicula(){

    DBConnection con= new DBConnection();
    String sql = "SELECT * FROM pelicula"; // Con mayuscula para identificar que es una Sentencia SQL 
    try { //Casos de errores
        Statement st = con.getConnection().createStatement();//Conexion
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            int id = rs.getInt("id");
            String titulo = rs.getString("titulo");
            String genero = rs.getString("genero");     
            String autor = rs.getString("autor");
            int copias = rs.getInt("copias"); //ESTO ES STRING O INT???? (En la grabacion sale como int)
            boolean novedad = rs.getBoolean("novedad");
            
            Pelicula peliculas = new Pelicula(id, titulo, genero, autor, copias, novedad);
            System.out.println(peliculas.toString());
        }
        
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
    finally{
    con.desconectar();
    }
}
    
}
