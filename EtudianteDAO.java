package server;

import java.sql.*;
import java.util.*;

public class EtudianteDAO {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            DbConfig.URL, DbConfig.USER, DbConfig.PASSWORD);
    }

    public List<Etudiante> findAll() throws Exception {
        List<Etudiante> list = new ArrayList<>();
        String sql = "SELECT * FROM etudiant";

        try (Connection c = getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Etudiante e = new Etudiante();
                e.id = rs.getInt("id");
                e.prenom = rs.getString("prenom");
                e.nom = rs.getString("nom");
                e.email = rs.getString("email");
                e.dateInscription = rs.getDate("dateinscription");
                list.add(e);
            }
        }
        return list;
    }
}
