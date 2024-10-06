class Cachorro extends Animal {
    // Construtor que chama o construtor da classe Animal
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da classe base Animal
    }

    // Método para simular o cachorro latindo
    public void late() {
        System.out.println(nome + " está latindo: Au Au!");
    }
}