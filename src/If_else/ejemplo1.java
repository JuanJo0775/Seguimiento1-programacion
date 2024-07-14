package If_else;

public class ejemplo1 {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // if para saber si el numero es positivo o negativo

    public void numeroes(){
        if (getX()>0){
            System.out.println("El numero " +getX()+ " es positivo");
        } else if (getX()<0) {
            System.out.println("El numero " +getX()+ " es negativo");
        }else {
            System.out.println("El numero " +getX()+ " es cero");
        }
    }
}
