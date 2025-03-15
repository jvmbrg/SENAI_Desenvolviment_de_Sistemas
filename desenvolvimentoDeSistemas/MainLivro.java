public class MainLivro {
    public static void main(final String[] args) {
    
        
    Livro livro1 = new Livro("O Auto da Compadecida", "Ariano Suassuna", 355, 59.99);
    Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K Rowlling", 535, 78.59);
    
    System.out.println("---------------------------");
    System.out.println(livro1.toString());
    System.out.println();
    System.out.println("---------------------------");
    System.out.println(livro2.toString());

    }
}