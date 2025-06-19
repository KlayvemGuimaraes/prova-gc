public class Q3 {
    public static void main(String[] args) {
        Item item1 = new Item("Caneta");
        Item item2 = new Item("Lápis", 3);
    }
}

class Item {
    String nome;
    int quantidade;

    public Item(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}
