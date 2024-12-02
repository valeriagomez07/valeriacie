package es.curso2;

public class PrincipalRectangulo {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.lado1 = 20;
        r.lado2 = 10;

        System.out.println(r.area());
    }
}
