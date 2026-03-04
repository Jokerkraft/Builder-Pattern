package Models;

import Strategies.Habilidad;
import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private final String tipo;
    private final int fuerza, inteligencia, velocidad, resistencia;
    private final List<Habilidad> habilidades;

    public Personaje(String t, int f, int i, int v, int r, List<Habilidad> h) {
        this.tipo = t; 
        this.fuerza = f; 
        this.inteligencia = i;
        this.velocidad = v; 
        this.resistencia = r;
        this.habilidades = new ArrayList<>(h);
    }

    // Getters
    public String getTipo() { 
        return tipo; 
    }

    public int getFuerza() { 
        return fuerza; 
    }
    
    public int getInteligencia() { 
        return inteligencia; 
    }

    public int getVelocidad(){
        return velocidad;
    }

    public int getResistencia(){
        return resistencia;
    }

    public List<Habilidad> getHabilidades() { 
        return habilidades; 
    }
}
