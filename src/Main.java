import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        PokemonManager manager = new PokemonManager();

        Pokemon pokemon = null;

        while(pokemon == null){
            System.out.print("Choose a pokemon: pikachu/charizard/squirtle: ");
            String pokemonChoice = scanner.nextLine().toLowerCase();
            pokemon = PokemonFactory.choosePokemon(pokemonChoice);

            if(pokemon != null){
                System.out.println(pokemon + " I choose you");
            }
            else{
                System.out.println("Invalid choice, try again");
            }
        }

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

        scanner.close();
    }

}
