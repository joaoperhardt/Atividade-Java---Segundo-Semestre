package ListaExercicio4;

import javax.swing.*;

public class AppQuestao3Ui {
    public static void main(String[] args) {
        int altura;
        int comprimento;

        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retângulo:"));

        Retangulo retangulo = new Retangulo(altura, comprimento);

        JOptionPane.showMessageDialog(
                null,
                "O perímetro do retângulo: " + retangulo.calcularPerimetro() +
                        "\n A área do retângulo: " + retangulo.calcularArea()
        );
    }
}
