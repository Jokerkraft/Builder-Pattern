package Models;

import Strategies.HabilidadStrategy;
import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    protected String tipo;
    protected int fuerza, inteligencia, velocidad, resistencia;
    protected List<HabilidadStrategy> habilidades;

    public Personaje(String tipo, int fuerza, int inteligencia, int velocidad, int resistencia) {
        this.tipo = tipo; 
        this.fuerza = fuerza; 
        this.inteligencia = inteligencia;
        this.velocidad = velocidad; 
        this.resistencia = resistencia;
        this.habilidades = new ArrayList<>();
    }

    // Setters y Getters
    
    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public void setResistencia(int resistencia){
        this.resistencia = resistencia;
    }

    public void agregarHabilidades(HabilidadStrategy habilidad){
        this.habilidades.add(habilidad);
    }

    public void mostrarFicha() {
        System.out.println("\nFicha del Personaje");
        System.out.println("-------");
        System.out.println("Tipo: " + tipo);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Habilidades: " + habilidades.size());
        System.out.println("-------\n");
        
    }

    public void ejecutarHabilidades() {
        System.out.println("\nEjecutando habilidades de " + tipo);
        System.out.println("-------");
        if (habilidades.isEmpty()) {
            System.out.println("Este personaje no tiene habilidades asignadas.");
        } else {
            for (HabilidadStrategy habilidad : habilidades) {
                habilidad.ejecutar();
            }
        }
        System.out.println("-------\n");
    }

    public void agregarHabilidad(HabilidadStrategy habilidad) {
    this.habilidades.add(habilidad); 
    } 

}
