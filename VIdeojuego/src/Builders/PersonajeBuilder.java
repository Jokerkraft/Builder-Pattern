package Builders;
import Models.Personaje;
import Strategies.Habilidad;
import java.util.ArrayList;
import java.util.List;

public abstract class PersonajeBuilder {
    protected String tipo; protected int f, i, v, r;
    private final List<Habilidad> habilidades = new ArrayList<>();
    public abstract void configurarStatsBase();
    public void agregarHabilidad(Habilidad h) { 
        habilidades.add(h); 
    }
    public Personaje build() { 
        return new Personaje(tipo, f, i, v, r, habilidades); 
    }
}
