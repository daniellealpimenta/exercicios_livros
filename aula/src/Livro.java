public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public java.lang.String getTitulo() {
        return titulo;
    }

    public java.lang.String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo do Livro: " + getTitulo());
        System.out.println("Ator do Livro: " + getAutor());
        System.out.println("Preço do livro: " + getPreco());
    }
}
