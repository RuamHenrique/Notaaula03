class Programador extends Funcionario {
    private String linguagem;

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("Linguagem: " + linguagem);
    }
}