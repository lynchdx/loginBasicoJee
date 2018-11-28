package modelo;

import java.sql.ResultSet;
import java.sql.Statement;

public class Consulta extends Conexion {

    
//--------------------------Método de autenticación----------------------
    public boolean autenticarModelo(String nombre, String pas) {
        boolean ingresa = false;

        try {
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String query = "select * from usuario";
            rs = st.executeQuery(query);

            while (rs.next()) {

                // nombre y pass dentro de rs.getString son los de la BD
                if (nombre.equals(rs.getString("nombre")) && pas.equals(rs.getString("pass"))) {
                    ingresa = true;
                }
                
            }
        } catch (Exception e) {
            System.err.println("" + e.getMessage());
        }
        return ingresa;

    }
    
    
    
    
    public static void main(String[] args) {
        Consulta c = new Consulta();
        System.out.println(""+c.autenticarModelo("", ""));
    }

}
