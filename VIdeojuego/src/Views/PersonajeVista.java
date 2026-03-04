package Views;

import Strategies.Habilidad;
import java.util.List;

public class PersonajeVista {
    public void mostrarPersonaje(String tipo, int f, int i, int v, int r,  List<Habilidad> habilidades) {
        System.out.println("========================================");
        System.out.println("FICHA TECNICA: " + tipo);
        System.out.println("========================================");
        System.out.println("Stats:" + "\nFuerza: " + f + "\nInteligencia: " + i
            + "\nVelocidad: " + v + "\nResistencia: " + r
        );
        System.out.println("========================================");
        System.out.println("Habilidades Activas:");
        if (habilidades.isEmpty()) System.out.println("   (Ninguna)");
        else habilidades.forEach(Habilidad::ejecutar);
        System.out.println("========================================\n");
    }

}
