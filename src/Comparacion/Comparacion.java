package Comparacion;

public class Comparacion {
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

    // comparacion

    public void igual(){
        boolean i = (getX()==getY());
        System.out.println(i);
    }

    public void diferente(){
        boolean i = (getX()!=getY());
        System.out.println(i);
    }

    public void mayorque(){
        boolean i = (getX()>getY());
        System.out.println(i);
    }
}
