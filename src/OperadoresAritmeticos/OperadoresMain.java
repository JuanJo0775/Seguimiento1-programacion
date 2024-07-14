package OperadoresAritmeticos;

public class OperadoresMain {
    public static void main(String[] args) {

        // aritmeticos
        Operadores o1 = new Operadores();
        o1.setX(10);
        o1.setY(2);

        o1.resta();
        o1.suma();
        o1.multiplicar();

        // logicos
        Operadores o2 = new Operadores();
        o2.setX(20);
        o2.setY(-20);

        o2.ambos();
        o2.soloUno();
        o2.negativo();
    }
}
