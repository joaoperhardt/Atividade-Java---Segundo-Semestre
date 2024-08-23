package ListaExercicio3.Questao1;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome é inválido");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
