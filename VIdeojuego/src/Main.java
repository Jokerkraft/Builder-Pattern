import Builders.PersonajeBuilder;
import Factories.PersonajeFactory;
import Models.Personaje;
import Strategies.AtaqueBolaDeFuego;
import Strategies.AtaqueEspadazo;
import Views.VistaPersonaje;

public class Main {
    public static void main(String[] args) throws Exception {
        VistaPersonaje vista = new VistaPersonaje();

        vista.mostrarNombre("Bienvenido al Sistema de Batallas");
        vista.saltoDeLinea();

        vista.mostrarMensaje("Creando un nuevo personaje...");

        PersonajeBuilder<?> guerreroBuilder = PersonajeFactory.obtenerBuilder("Guerrero");
        Personaje guerrero = guerreroBuilder
                .agregarHabilidad(new AtaqueEspadazo())
                .obtenerPersonaje();

        guerrero.mostrarFicha();
        guerrero.ejecutarHabilidades();
        vista.saltoDeLinea();

        vista.mostrarMensaje("Creando un nuevo personaje...");
        PersonajeBuilder<?> magoBuilder = PersonajeFactory.obtenerBuilder("Mago");
        Personaje mago = magoBuilder
                .agregarHabilidad(new AtaqueBolaDeFuego())
                .obtenerPersonaje();

        mago.mostrarFicha();
        mago.ejecutarHabilidades();

        vista.saltoDeLinea();

        vista.mostrarNombre("La batalla ha finalizado");
    }
}
