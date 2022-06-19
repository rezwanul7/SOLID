package after;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Product Creation
        Product product = ProductFactory.getSampleProduct();

        //Essential Attribute Value Collection
        List<AttributeOption> essentialAttributeOptions = Arrays.asList(AttributeOption.COLOR, AttributeOption.SEASON);

        AttributeCollectionService attributeCollectionService = new AttributeCollectionService(product.getAttributeInfoList(), essentialAttributeOptions);
        attributeCollectionService.collect();
        List<AttributeInfo> essentialAttributeInfoList = attributeCollectionService.getEssentialAttributeInfoList();

        //Print Essentials
        for (AttributeInfo essentialAttributeInfo : essentialAttributeInfoList) {
            System.out.println(essentialAttributeInfo.getAttributeOption() + " : " + essentialAttributeInfo.getValue());
        }
    }
}
