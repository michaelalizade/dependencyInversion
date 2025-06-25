public class PokemonFactory {

    public static Pokemon choosePokemon(String pokemonName){
            return switch (pokemonName){
                case "pikachu" ->  new Pikachu();
                case "charizard" -> new Charizard();
                case "squirtle" -> new Squirtle();
                default -> null;
            };
    }
}
