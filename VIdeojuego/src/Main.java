import Builders.PersonajeBuilder;
import Controller.PersonajeController;
import Factories.PersonajeFactory;
import Models.Personaje;
import Strategies.AtaqueBolaDeFuego;
import Strategies.AtaqueEspadazo;
import Views.PersonajeVista;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonajeVista vista = new PersonajeVista();

        // --- CREANDO AL MAGO ---
        PersonajeBuilder builderMago = PersonajeFactory.obtenerBuilder("mago");
        builderMago.configurarStatsBase();
        builderMago.agregarHabilidad(new AtaqueBolaDeFuego());
        
        Personaje magoModel = builderMago.build();
        PersonajeController controlMago = new PersonajeController(magoModel, vista);
        controlMago.actualizarVista();

        // --- CREANDO AL GUERRERO ---
        PersonajeBuilder builderGuerrero = PersonajeFactory.obtenerBuilder("guerrero");
        builderGuerrero.configurarStatsBase();
        builderGuerrero.agregarHabilidad(new AtaqueEspadazo());
        
        Personaje guerreroModel = builderGuerrero.build();
        PersonajeController ctrlGuerrero = new PersonajeController(guerreroModel, vista);
        ctrlGuerrero.actualizarVista();
    }
}
