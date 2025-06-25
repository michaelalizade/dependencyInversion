import java.util.Random;

public class Trainer {

    private Pokemon pokemon;
    String name;

    public Trainer(Pokemon pokemon, String name){
        this.pokemon = pokemon;
        this.name = name;
    }

    public void attack(){
            Random random = new Random();
            int damage = random.nextInt(6) + 1;
            System.out.println(name + "'s " + pokemon + " attacks for " + damage + " " + pokemon.getType() + " damage");
    }
}
