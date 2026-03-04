package Builders;

public class MagoBuilder extends PersonajeBuilder {
    @Override
    public void configurarStatsBase() { 
        this.tipo = "Mago"; this.f = 3; this.i = 10; this.v = 6; this.r = 6;
    }
}
