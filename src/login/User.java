package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    
    /**
    * Classe utilizada para criar a conexão do banco de dados com o sistema.
    * Para possibilitar a comunicação de dados armazenados.
    */
    public Connection conectarBD() {
        /**
         * Inicializa a variável de conexão com o banco de dados.
         * Responsável por sinalizar se a conexão foi feita com êxito.
         * 
         * @return conexão com o banco de dados
         */
        Connection conn = null;
        
        /**
         * Tentativa de conexão com o banco de dados.
         * Primeiro é passado o caminho MYSQL, após isso a url de conexão do banco de dados e a tentativa de conexão.
         */
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {}
        
        return conn;
    }
    
    /**
     * Variáveis para receber um nome do tipo String e o resultado da conexão.
     */
    
    public String nome="";
    public boolean result = false;
    
    /**
     * Classe utilizada para verificar se o usuário existe.
     * @param login
     * @param senha
     * @return resultado de conexão
     */
    
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        
        //INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        
        /**
         * Executar a instrução SQL para retornar os dados de pesquisa.
         */
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
            
        } catch (Exception e){}
            return result;
    }
} //Fim da class
