public class Ebook extends Livro{
    private double tamanhoArquivo;
    public Ebook(String titulo, String autor, double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho do arquivo do livro: " + getTamanhoArquivo() + "mb");
    }
}
