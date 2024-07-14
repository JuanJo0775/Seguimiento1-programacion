package Ciclos;

public class Do {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void ciclo(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= getX());
    }
}
