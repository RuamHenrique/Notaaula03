class Gato extends Animal {
    // Construtor que chama o construtor da classe Animal
    public Gato(String nome) {
        super(nome); // Chama o construtor da classe base Animal
    }

    // Método para simular o gato miando
    public void mia() {
        System.out.println(nome + " está miando: Miau!");
    }
}