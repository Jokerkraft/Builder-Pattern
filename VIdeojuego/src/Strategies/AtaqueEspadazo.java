package Strategies;

public class AtaqueEspadazo implements Habilidad {
    @Override
    public void ejecutar() {
         System.out.println("¡Espadazo!"); 
        }

    @Override    
    public String getNombre() { 
        return "Ataque con Espada"; 
    }
}
