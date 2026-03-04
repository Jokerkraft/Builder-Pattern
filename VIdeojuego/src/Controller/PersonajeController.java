package Controller;

import Models.Personaje;
import Views.PersonajeVista;
 
public class PersonajeController {
    private Personaje model;  
    private PersonajeVista vista;

    public PersonajeController(Personaje model, PersonajeVista vista) {
        this.model = model;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.mostrarPersonaje(
            model.getTipo(), 
            model.getFuerza(), 
            model.getInteligencia(),
            model.getVelocidad(), 
            model.getResistencia(), 
            model.getHabilidades()
        );
    }
}