public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Inserindo livros
        biblioteca.inserirLivro(new Livro(3, "Livro C", "Autor C", 2003));
        biblioteca.inserirLivro(new Livro(1, "Livro A", "Autor A", 2001));
        biblioteca.inserirLivro(new Livro(2, "Livro B", "Autor B", 2002));

        // Listando livros
        System.out.println("Listagem de livros:");
        biblioteca.listarLivros();

        // Buscando livro por ID
        int idBusca = 2;
        Livro livro = biblioteca.buscarLivro(idBusca);
        if (livro != null) {
            System.out.println("\nLivro encontrado: " + livro);
        } else {
            System.out.println("\nLivro com ID " + idBusca + " não encontrado.");
        }

        // Removendo livro por ID
        int idRemocao = 1;
        boolean removido = biblioteca.removerLivro(idRemocao);
        if (removido) {
            System.out.println("\nLivro com ID " + idRemocao + " removido com sucesso.");
        } else {
            System.out.println("\nLivro com ID " + idRemocao + " não encontrado.");
        }

        // Listando livros após remoção
        System.out.println("\nListagem de livros após remoção:");
        biblioteca.listarLivros();
    }
}
