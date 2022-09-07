public class PokemonAtaque  extends Pokemon{
    public double ataque;
    
    public PokemonAtaque(String tipo,double ataque) {
        super(tipo);
        System.out.println("tipo = " + tipo);
        this.ataque = ataque;
    }
}
