package ListaExercicio4;

import javax.swing.*;

public class AppQuestao2Ui {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retângulo:")));
        retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retângulo:")));

        JOptionPane.showMessageDialog(
                null,
                "O perímetro do retângulo: " + retangulo.calcularPerimetro() +
                        "\n A área do retângulo: " + retangulo.calcularArea()
        );
    }
}
