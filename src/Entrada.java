public class Entrada {
    public static void main(String[] args) {
        PokemonAtaque pokeAtack = new PokemonAtaque("fuego",50);
        PokemonDefensor pokeDefender = new PokemonDefensor("planta",60);
        Calculo calc = new Calculo(pokeAtack.tipo,pokeDefender.tipo,pokeAtack.ataque,pokeDefender.defensa);
        System.out.println("El daño ha sido de = " + calc.danioTotal());
    }

}
