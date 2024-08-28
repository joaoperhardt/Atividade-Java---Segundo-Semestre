package ListaExercicio3.Questao1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario)
    {
        setNome(nome);
        setSalario(salario);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException
    {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome é inválido");
        }
        this.nome = nome;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public double calcularIrpf() {
        double diferenca = 0;
        double total = 0;

        // faixa 1
        if (salario <= 1903.98) {
            return 0;
        }

        // faixa 2
        if (salario >= 1903.99) {
            if(salario < 2826.65) {
                diferenca = salario - 1903.99;
                total += (diferenca * 0.075);
            }
            else {
                diferenca = 2826.65 - 1903.99;
                total += (diferenca * 0.075);
            }
        }

        // faixa 3
        if (salario >= 2826.66) {
            if(salario < 3751.05) {
                diferenca = salario - 2826.66;
                total += (diferenca * 0.15);
            }
            else {
                diferenca = 3751.05 - 2826.66;
                total += (diferenca * 0.15);
            }
        }

        // faixa 4
        if (salario >= 3751.06) {
            if(salario < 4664.68) {
                diferenca = salario - 3751.06;
                total += (diferenca * 0.225);
            }
            else {
                diferenca = 4664.68 - 3751.06;
                total += (diferenca * 0.225);
            }
        }

        // faixa 5
        if (salario >= 4664.69) {
            diferenca = salario - 4664.69;
            total += (diferenca * 0.275);
        }

        return total;
    }

    /*
    FAIXA_1_LIMITE_SUP = 1903.98;
    FAIXA_2_LIMITE_INF = 1903.99;
    FAIXA_2_LIMITE_SUP = 2826.65;
    FAIXA_3_LIMITE_INF = 2826.66;
    FAIXA_3_LIMITE_SUP = 3751.05;
    FAIXA_4_LIMITE_INF = 3751.06;
    FAIXA_4_LIMITE_SUP = 4664.68 ;
    FAIXA_5_LIMITE_INF = 4664.69;
    
    ALIQUOTA_FAIXA_2 = 0.075;
    ALIQUOTA_FAIXA_3 = 0.15;
    ALIQUOTA_FAIXA_4 = 0.225;
    ALIQUOTA_FAIXA_5 = 0.275;
     */
}
