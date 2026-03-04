package Builders;

public class GuerreroBuilder extends PersonajeBuilder{
    @Override
    public void configurarStatsBase() {
         this.tipo = "Guerrero"; this.f = 10; this.i = 2; this.v = 8; this.r = 8; 
    }
}
