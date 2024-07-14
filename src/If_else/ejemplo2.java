package If_else;

public class ejemplo2 {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // if para saber si alguien es mayor de 18

    public void esmayor(){
        if (getX()>=18){
            System.out.println("La persona es mayor de edad");
        } else if (getX()<18 && getX()>-1) {
            System.out.println("La persona es menor de edad");
        }else {
            System.out.println("Edad no validad");
        }
    }
}
