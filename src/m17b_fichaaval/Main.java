package m17b_fichaaval;
// Carlos Peregrino & Igor Klyukevych
/**
 * 
 * @author a16116 & a16947
 */

public class Main {
//Repositorio: https://github.com/HyperPT/M17FichaAval
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p2.distancia(p1));
    }
}
