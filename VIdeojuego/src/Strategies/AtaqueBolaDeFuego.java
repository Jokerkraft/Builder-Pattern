package Strategies;

public class AtaqueBolaDeFuego implements Habilidad{
    @Override
    public void ejecutar() { 
        System.out.println("¡Bola de Fuego!"); 
    }

    @Override
    public String getNombre() { 
        return "Bola de Fuego"; 
    }
}