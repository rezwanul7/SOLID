package before;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Product Creation
        Product product = new Product(1, "MEN'S COMPLETE SUIT");
        List<AttributeInfo> attributeList = new ArrayList<>();
        attributeList.add(new AttributeInfo(AttributeOption.COLOR, "Blue", "blue"));
        attributeList.add(new AttributeInfo(AttributeOption.PANT_COLOR, "Black", "black"));
        attributeList.add(new AttributeInfo(AttributeOption.SEASON, "Summer", "summer"));
        attributeList.add(new AttributeInfo(AttributeOption.DESIGNER, "Raymond", "raymond"));
        product.setAttributeInfoList(attributeList);

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
