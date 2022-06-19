package before;

import java.util.List;

public class Product {
    private Integer id;
    private String name;
    private List<AttributeInfo> attributeInfoList;

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAttributeInfoList(List<AttributeInfo> attributeInfoList) {
        this.attributeInfoList = attributeInfoList;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<AttributeInfo> getAttributeInfoList() {
        return attributeInfoList;
    }
}
