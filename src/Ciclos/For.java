package Ciclos;

public class For {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void ciclo(){
        for (int i = 0; i <= getX(); i++) {
            System.out.println(i);
        }
    }
}
