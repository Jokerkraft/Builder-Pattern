package Controller;

import Factories.PersonajeFactory;
import Models.Personaje;
import Strategies.HabilidadStrategy;
import Views.VistaPersonaje;

public class PersonajesController {
    private final VistaPersonaje vista;

    public PersonajesController(VistaPersonaje vista) {
        this.vista = vista;
    }

    private boolean esValido(Personaje personaje) {
        if (personaje == null) {
            vista.mostrarMensaje("Error: El personaje es nulo.");
            return false;
        }
        return true;
    }

    public Personaje generarPersonaje(String tipo) {
        try {
            Personaje nuevo = PersonajeFactory.obtenerBuilder(tipo).obtenerPersonaje();
            vista.mostrarMensaje("Sistema: " + tipo + " creado correctamente.");
            return nuevo;
        } catch (Exception e) {
            vista.mostrarMensaje("Error en la creación: " + e.getMessage());
            return null;
        }
    }

    public void agregarHabilidad(Personaje personaje, HabilidadStrategy habilidad) {
        if (esValido(personaje) && habilidad != null) {
            personaje.agregarHabilidad(habilidad);
            vista.mostrarMensaje("Habilidad añadida.");
        }
    }

    public void mostrarFichaPersonaje(Personaje personaje) {
        if (esValido(personaje)) {
            personaje.mostrarFicha(); 
        }
    }

    public void ejecutarHabilidades(Personaje personaje) {
        if (esValido(personaje)) {
            personaje.ejecutarHabilidades();
        }
    }
}