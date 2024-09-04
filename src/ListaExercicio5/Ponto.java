package ListaExercicio5;

public class Ponto {
    private int x;
    private int y;

    public Ponto() {
        setX(0);
        setY(0);
    }

    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Quadrante identificarQuadrante() {
        if (getX() > 0 && getY() > 0) {
            return Quadrante.PRIMEIRO;
        }
        else if (getX() < 0 && getY() > 0) {
            return Quadrante.SEGUNDO;
        }
        else if (getX() < 0 && getY() < 0) {
            return Quadrante.TERCEIRO;
        }
        else if (getX() > 0 && getY() < 0) {
            return Quadrante.QUARTO;
        }
        else {
            return Quadrante.NENHUM;
        }
    }

    
}
