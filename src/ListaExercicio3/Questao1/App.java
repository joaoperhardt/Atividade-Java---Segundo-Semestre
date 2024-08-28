package ListaExercicio3.Questao1;

import javax.swing.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double totalImposto = 0;

        Funcionario funcionario = criarConta();
        totalImposto = funcionario.calcularIrpf();
        JOptionPane.showMessageDialog(null, "O imposto total a ser pago é: R$ " + totalImposto);
    }

    static Funcionario criarConta()
    {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionario");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario"));

        return new Funcionario(nome, salario);
    }
}
