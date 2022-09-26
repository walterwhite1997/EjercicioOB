public class Main {
    public static void main(String[] args) {
        suma(10, 20 ,30);


        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println("numero de puertas:" + miCoche.puertas);
    }
    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
class Coche {
    public int puertas = 3;
    public void SumarPuertas() {
        this.puertas++;
    }
}