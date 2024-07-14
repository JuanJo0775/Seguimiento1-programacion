package Sentencias;

public class Break {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void sentencia(){
        for (int i = 0; i <= getX(); i++) {
            if (i >= 10) {
                break;
            }
            System.out.println(i);
        }
    }
}
