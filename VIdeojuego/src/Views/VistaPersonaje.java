package Views;

public class VistaPersonaje {
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }


    public void mostrarNombre(String nombre){
        System.out.println("\n" + nombre);
    }

    public void mostrarStat(String nombre, Object valor){
        System.out.println("Nombre: " + valor);
    }

    public void saltoDeLinea(){
        System.out.println();
    }

}
