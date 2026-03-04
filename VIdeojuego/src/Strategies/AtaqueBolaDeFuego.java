package Strategies;

public class AtaqueBolaDeFuego implements HabilidadStrategy{
    @Override
    public void ejecutar() { 
        System.out.println("¡El mago lanza una Bola de Fuego!"); 
    }
}