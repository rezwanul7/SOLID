package after;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {
    public static Product getSampleProduct(){
        Product product = new Product(1, "MEN'S COMPLETE SUIT");
        List<AttributeInfo> attributeList = new ArrayList<>();
        attributeList.add(new AttributeInfo(AttributeOption.COLOR, "Blue", "blue"));
        attributeList.add(new AttributeInfo(AttributeOption.PANT_COLOR, "Black", "black"));
        attributeList.add(new AttributeInfo(AttributeOption.SEASON, "Summer", "summer"));
        attributeList.add(new AttributeInfo(AttributeOption.DESIGNER, "Raymond", "raymond"));
        product.setAttributeInfoList(attributeList);
        return product;
    }
}
