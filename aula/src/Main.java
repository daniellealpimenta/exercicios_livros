//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Livro> livros = new ArrayList<Livro>();

        livros.add(new Livro("Alice no país das Maravilhas", "jorgin", 150.00));
        livros.add(new Ebook("Harry Potter", "J.k.rolling", 250.00, 1000.00));
        livros.add(new Livro("Senhor dos aneis", "Gandalf", 280.00));
        livros.add(new Ebook("O diário de um banana", "jorgin", 80.00, 300.00));

        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println("");
        }


    }
}