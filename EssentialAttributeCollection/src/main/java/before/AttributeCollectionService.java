package before;

import java.util.List;

public class AttributeCollectionService {
    private Product product;
    private String color;
    private String season;

    public AttributeCollectionService(Product product) {
        this.product = product;
    }

    public void collect() {
        List<AttributeInfo> attributeInfoList = product.getAttributeInfoList();
        for (AttributeInfo attributeInfo : attributeInfoList) {
            if (attributeInfo.getAttributeOption() == AttributeOption.COLOR){
                this.color = attributeInfo.getValue();
            } else if (attributeInfo.getAttributeOption() == AttributeOption.SEASON){
                this.season = attributeInfo.getValue();
            }
        }
    }

    public String getColor() {
        return color;
    }

    public String getSeason() {
        return season;
    }
}
