public class Q8 {
    public static void main(String[] args) {
        Usuario u = new Usuario("João", 25);
    }
}

class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i) {
        nome = n;
        idade = i;
    }
}