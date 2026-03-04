package Builders;
import Models.Personaje;
import Strategies.HabilidadStrategy;

public abstract class PersonajeBuilder<T extends Personaje> {
    protected T personaje;

    public abstract void crearPersonaje();

    public PersonajeBuilder<T> agregarHabilidad(HabilidadStrategy habilidad) {
        if (this.personaje == null) {
            crearPersonaje();
        }
        
        this.personaje.agregarHabilidad(habilidad); 
        return this;
    }

    public T obtenerPersonaje() {
        if (this.personaje == null) {
            crearPersonaje();
        }
        return personaje;
    }
}