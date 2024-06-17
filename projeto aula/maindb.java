public classc maindb {
    public static void main (String[]args) {
        livro liv = new livro("o senhor dos aneis");
        liv.setautor("J. R. R. Tolken");
        liv.setano (1953);

        livroDAO objDAO = new livroDAO();
        objDAO.inserir(liv);
    }
}