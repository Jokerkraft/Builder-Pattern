package Factories;

import Builders.GuerreroBuilder;
import Builders.MagoBuilder;
import Builders.PersonajeBuilder;

public class PersonajeFactory {
    public static PersonajeBuilder obtenerBuilder(String tipo) {
        if (tipo.equalsIgnoreCase("guerrero")) return new GuerreroBuilder();
        if (tipo.equalsIgnoreCase("mago")) return new MagoBuilder();
        throw new IllegalArgumentException("Tipo no válido");
    }  
}
