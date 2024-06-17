import java.sql.Connection;
import java.sql.DriveManager;

public class usuario {
    //atributo
    private Connection conexao;
    //construtor
    public ConectaDB(){
        //sao as credenciais da sua conexao com DB
        String url= "jdbc:mariadb://localhost:3306/ed24"
        String user = "root"
        String pwd = "db123"
        try {
            conexao = DriveManager.getConnection(urç, user, pwd);
            System.out.println("conexao realizada");
        }catch (Exception e){
            System.out.println(e.getMessage ( ));
        }
    }
}