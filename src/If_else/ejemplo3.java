package If_else;

public class ejemplo3 {
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

    // if para saber si un numero es mayor a otro

    public void esmayor(){
        if (getX()>getY()){
            System.out.println("El numero " +getX()+ " es mayor a " +getY());
        } else if (getX()<getY()) {
            System.out.println("El numero " +getX()+ " es menor a " +getY());
        }else {
            System.out.println("El numero " +getX()+ " es igual a " +getY());
        }
    }
}
