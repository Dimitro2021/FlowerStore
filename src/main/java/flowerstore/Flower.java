package flowerstore;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Flower {
    @Getter@Setter
    private double sepalLength;
    @Getter@Setter
    private String colour;
    @Getter@Setter
    private double price;


}
