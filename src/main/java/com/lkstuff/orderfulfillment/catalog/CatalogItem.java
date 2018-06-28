package com.lkstuff.orderfulfillment.catalog;

import java.io.Serializable;

public class CatalogItem implements Serializable{

    private static final long serialVersionUID = -3048858539620507612L;

    private long id;
    private String itemNumber;
    private String itemName;
    private String itemType;

    public CatalogItem(){
    }

    public CatalogItem(long id, String itemNumber, String itemName, String itemType){
        this.id = id;
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemType = itemType;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getItemNumber(){
        return itemNumber;
    }

    public void setItemNumber(String itemNumber){
        this.itemNumber = itemNumber;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public String getItemType(){
        return itemType;
    }

    public void setItemType(String itemType){
        this.itemType = itemType;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("CatalogItem [id=");
        builder.append(id);
        builder.append(", ");
        if (itemNumber != null) {
            builder.append("itemNumber=");
            builder.append(itemNumber);
            builder.append(", ");
        }
        if (itemName != null) {
            builder.append("itemName=");
            builder.append(itemName);
            builder.append(", ");
        }
        if (itemType != null) {
            builder.append("itemType=");
            builder.append(itemType);
        }
        builder.append("]");
        return builder.toString();
    }


}
