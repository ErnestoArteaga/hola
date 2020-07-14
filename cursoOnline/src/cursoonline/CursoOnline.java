package cursoonline;

import cursoonline.dao.CursoDAO;
import cursoonline.dao.cursoDaoImpl;
import cursoonline.entidades.Curso;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CursoOnline {

    static String url = "jdbc:postgresql://localhost:5432/cursos_on";
    static String user = "postgres";
    static String password = "1234";

    public static void main(String[] args) {
        CursoDAO cursoDAO = new cursoDaoImpl();
        Curso newCurso = new Curso(0,"Lenguaje");
        cursoDAO.ingresar(newCurso);
        //cursoDAO.actualizar(newCurso);
        //cursoDAO.eliminar(0);
        
        List<Curso> cursos=cursoDAO.getCursos();
        System.out.println(cursos);
        System.out.println(cursos.size());
        System.out.println("ERNESTO DIDIER ARTEAGA PILOSO");
    }
    
    
    
//        Connection conn;
//        try {
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Conexion exitosa!!");
//            String sql = "SELECT id,nombre FROM public.cursos;";
//            PreparedStatement stm = conn.prepareStatement(sql);
//            ResultSet rs = stm.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getInt(1) +" "+ rs.getString(2));
//            }
//        
//        
//        } catch (SQLException ex) {
//            //TODO AUTO-GENERATED CATCH BLOCK
//            ex.printStackTrace();
//        }
//    }

}
