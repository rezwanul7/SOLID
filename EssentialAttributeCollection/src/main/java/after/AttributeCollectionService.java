package after;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AttributeCollectionService {
    private List<AttributeInfo> productAttributeInfoList;
    private List<AttributeOption> essentialAttributeOptions;
    private List<AttributeInfo> essentialAttributeInfoList = new ArrayList<>();
    private String color;
    private String season;


    public AttributeCollectionService(List<AttributeInfo> productAttributeInfoList, List<AttributeOption> essentialAttributeOptions) {
        this.productAttributeInfoList = productAttributeInfoList;
        this.essentialAttributeOptions = essentialAttributeOptions;
    }

    public void collect() {
        for (AttributeInfo productAttributeInfo : productAttributeInfoList) {
            if (essentialAttributeOptions.contains(productAttributeInfo.getAttributeOption())){
                essentialAttributeInfoList.add(productAttributeInfo);
            }
        }
    }

    public List<AttributeInfo> getEssentialAttributeInfoList() {
        return essentialAttributeInfoList;
    }
}
