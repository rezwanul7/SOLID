# Collect Essential Product Attributes 
Hundreds of custom attributes can be added to a Product. Each attribute consists of label, value, and it's type/option.

We need to find specific attributes for exporting to csv i.e. only `color` and `season`. In the future we may need to **extend** our program to find the `designer` attribute of the product as well. 

The package `after` consists the refactored version of the package `before`.

## Refactored Snip
- We have separated the product creation logic
- We can seamlessly extend our program to find other attributes i.e. `AttributeOption.DESIGNER` without modifying **AttributeCollectionService** class
```java
    //Essential Attribute Value Collection
        List<AttributeOption> essentialAttributeOptions = Arrays.asList(AttributeOption.COLOR, AttributeOption.SEASON);

        AttributeCollectionService attributeCollectionService = new AttributeCollectionService(product.getAttributeInfoList(), essentialAttributeOptions);
        attributeCollectionService.collect();
        List<AttributeInfo> essentialAttributeInfoList = attributeCollectionService.getEssentialAttributeInfoList();
        
```