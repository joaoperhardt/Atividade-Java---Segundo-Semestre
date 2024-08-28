package ListaExercicio4;

/*
@author João Pedro Erhardt
@date 28/08/2024
 */
public class Retangulo {
    private int altura;
    private int comprimento;

    public Retangulo()
    {
        this.altura = 0;
        this.comprimento = 0;
    }

    public Retangulo(int altura, int comprimento)
    {
        setAltura(altura);
        setComprimento(comprimento);
    }


    public int getAltura()
    {
        return altura;
    }

    public void setAltura(int altura)
    {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    public int getComprimento()
    {
        return comprimento;
    }

    public void setComprimento(int comprimento)
    {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }

    public int calcularPerimetro()
    {
        return (altura * 2) + (comprimento * 2);
    }

    public int calcularArea()
    {
        return (altura * comprimento);
    }
}
