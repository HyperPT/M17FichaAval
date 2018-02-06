package m17b_fichaaval;

public class Ponto2D {
    private int x;
    private int y;
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((getX()-a.getX()),2)+Math.pow((getY()-a.getY()),2)));
    }

    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + getX() + ", y=" + getY() + '}';
    }

    /**
     * Devolve o valor de x
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Altera o valor de x
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Devolve o valor de y
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Altera o valode de y
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
