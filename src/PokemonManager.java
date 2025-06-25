import java.util.Random;

public class PokemonManager {

    public Pokemon getRandomPokemon(Random random) {
        int choice = random.nextInt(3);
        return switch (choice) {
            case 0 -> new Pikachu();
            case 1 -> new Charizard();
            case 2 -> new Squirtle();
            default -> new Pikachu();
        };
    }

}
