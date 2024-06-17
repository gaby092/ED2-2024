import java.util.LinkedList;
import java.util.ListIterator;

public class Biblioteca {
    private LinkedList<Livro> livros;

    public Biblioteca() {
        this.livros = new LinkedList<>();
    }

    public void inserirLivro(Livro livro) {
        ListIterator<Livro> iterator = livros.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() > livro.getId()) {
                iterator.previous();
                iterator.add(livro);
                return;
            }
        }
        livros.add(livro);
    }

    public Livro buscarLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public boolean removerLivro(int id) {
        ListIterator<Livro> iterator = livros.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
