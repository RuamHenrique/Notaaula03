class Funcionario {
    protected String nome;
    protected int diaNascimento;
    protected int mesNascimento;
    protected int anoNascimento;
    protected double salario;

    // Métodos Setters para atribuir valores aos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para informar o salário
    public void informarSalario() {
        System.out.println("Salário: R$" + salario);
    }

    // Método para calcular a idade manualmente
    public int calcularIdade(int diaAtual, int mesAtual, int anoAtual) {
        int idade = anoAtual - anoNascimento;

        // Se o mês atual for antes do mês de nascimento, ou se for o mesmo mês mas o dia ainda não passou,
        // subtrai um ano da idade
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }
}