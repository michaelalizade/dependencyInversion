public class Pikachu implements Pokemon{

    @Override
    public String getType(){
        return TYPE;
    }

    @Override
    public String toString(){
        return "Pikachu";
    }

    final String TYPE = "Lightning";
}
