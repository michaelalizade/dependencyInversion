public class Charizard implements Pokemon{

    @Override
    public String getType(){
        return TYPE;
    }

    @Override
    public String toString(){
        return "Charizard";
    }

    final String TYPE = "Fire";
}
