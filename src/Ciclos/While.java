package Ciclos;

public class While {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void ciclo(){
        int i = 0;
        while (i <= getX()) {
            System.out.println(i);
            i++;
        }
    }
}
