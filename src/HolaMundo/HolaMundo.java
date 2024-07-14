package HolaMundo;

public class HolaMundo {
    String mensaje;;

    public String getMensaje (){
         return this.mensaje;
    }
    public void setMensaje (String m){
        this.mensaje = m;
    }

    public void mostrarMensaje(){
        System.out.println(getMensaje());
    }

}
