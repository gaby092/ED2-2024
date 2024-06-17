import java.sql.preparedstatement;

public class livroDAO {
    public void inserir(Livro livro){
        ConectaDB conexao = new ConectaDB ();
        String sql = "INSERT INTO livro (titulo, autor, ano) values(?,?,?)";
        try {
            preparedstatement pst =conexao.getconexaodb()
            preparedstatement(sql);
            pst.setString(1,livro.getTitulo());
            pst.setString(2, livro.getAutor());
            pst.setInt(3, livro.getAno());
            pst.execute();
            System.out.println("inserçao ok:" +livro);
        }catch (Exception ed24){
            System.out.println("falha na inserçao: "+ ed24.getMessage());
        }
    }
}