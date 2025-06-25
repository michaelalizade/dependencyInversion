import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Pokemon pokemon = null;
        while(pokemon == null){
            System.out.print("Choose a pokemon: pikachu/charizard/squirtle: ");
            String pokemonChoice = scanner.nextLine().toLowerCase();

            switch (pokemonChoice){
                case "pikachu" -> pokemon = new Pikachu();
                case "charizard" -> pokemon = new Charizard();
                case "squirtle" -> pokemon = new Squirtle();
                default -> System.out.println("Invalid choice, try again");
            }
        }

        PokemonManager manager = new PokemonManager();

        Trainer playerTrainer = new Trainer(pokemon, "Player");

        Trainer trainer2 = new Trainer(manager.getRandomPokemon(random), "Trainer Ash");
        Trainer trainer3 = new Trainer(manager.getRandomPokemon(random), "Trainer Gary");

        System.out.println("======");
        System.out.println("Fight!");
        System.out.println("======");

        System.out.println("Enter 'attack' to attack: ");
        String attackChoice = scanner.nextLine().toLowerCase();

        if (attackChoice.equals("attack")) {
            playerTrainer.attack();
        }
        else {
            System.out.println("Invalid move, skipping turn");
        }

        trainer2.attack();
        trainer3.attack();

    }

}
