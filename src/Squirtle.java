public class Squirtle implements Pokemon{

    @Override
    public String getType(){
        return TYPE;
    }

    @Override
    public String toString(){
        return "Squirtle";
    }

    final String TYPE = "Water";
}
