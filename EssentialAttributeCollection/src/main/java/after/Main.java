package after;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Product Creation
        Product product = ProductFactory.getSampleProduct();

        //Essential Attribute Value Collection
        AttributeCollectionService attributeCollectionService = new AttributeCollectionService(product);
        attributeCollectionService.collect();

        //Print Essentials
        System.out.println(
                "Color : " + attributeCollectionService.getColor() +
                        "\nSeason : " + attributeCollectionService.getSeason()
        );
    }
}
