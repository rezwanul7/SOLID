package after;

import java.util.List;

public class AttributeInfoPrinter {
    List<AttributeInfo> attributeInfoList;

    public AttributeInfoPrinter(List<AttributeInfo> attributeInfoList) {
        this.attributeInfoList = attributeInfoList;
    }

    public void execute(){
        for (AttributeInfo attributeInfo : attributeInfoList) {
            System.out.println(attributeInfo.getAttributeOption() + " : " + attributeInfo.getValue());
        }
    }
}
