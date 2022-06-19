package before;

public class AttributeInfo {
    private String label;
    private String value;
    private AttributeOption attributeOption;

    public AttributeInfo(AttributeOption attributeOption, String label, String value) {
        this.attributeOption = attributeOption;
        this.label = label;
        this.value = value;
    }

    public AttributeOption getAttributeOption() {
        return attributeOption;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
