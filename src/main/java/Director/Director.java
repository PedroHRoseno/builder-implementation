package Director;

import builder.Builder;

public class Director {

    public void constructHondaCar(Builder builder){
        builder.id(1L);
        builder.brand("HONDA");
        builder.model("CIVIC");
        builder.color("Black");
    }
}
