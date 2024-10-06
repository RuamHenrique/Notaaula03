class Gerente extends Funcionario {
    private String projeto;

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Projeto: " + projeto);
    }
}


