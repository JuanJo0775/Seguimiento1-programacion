package OperadoresAritmeticos;

public class Operadores {
    public int x;
    public int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // aritmeticos

    public void resta(){
        int i = getX() - getY();
        System.out.println(i);
    }

    public void suma(){
        int i = getX() + getY();
        System.out.println(i);
    }

    public void multiplicar(){
        int i = getX() * getY();
        System.out.println(i);
    }

    // logicos

    public void ambos(){
        boolean i = getX()>0 && getY()>0;
        System.out.println(i);
    }

    public void soloUno(){
        boolean i = getX()>0 || getY()>0;
        System.out.println(i);
    }

    public void negativo(){
        boolean i = !(getY()>0);
        System.out.println(i);
    }
}
