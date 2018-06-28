package com.lkstuff.orderfulfillment.order;

import com.lkstuff.orderfulfillment.catalog.CatalogItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderItem implements Serializable{
    private static final long serialVersionUID = 8218385047375857766L;

    private long id;
    private CatalogItem catalogItem;
    private String status;
    private BigDecimal price;
    private Date lastUpdate;
    private int quantity;

    public OrderItem() {

    }

    public OrderItem(long id, CatalogItem catalogItem, String status, BigDecimal price,
                     Date lastUpdate, int quantity) {
        super();
        this.id = id;
        this.catalogItem = catalogItem;
        this.status = status;
        this.price = price;
        this.lastUpdate = lastUpdate;
        this.quantity = quantity;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public CatalogItem getCatalogItem(){
        return catalogItem;
    }

    public void setCatalogItem(CatalogItem catalogItem){
        this.catalogItem = catalogItem;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public Date getLastUpdate(){
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OrderItem [id=");
        builder.append(id);
        builder.append(", ");
        if (catalogItem != null) {
            builder.append("catalogItem=");
            builder.append(catalogItem);
            builder.append(", ");
        }
        if (status != null) {
            builder.append("status=");
            builder.append(status);
            builder.append(", ");
        }
        if (price != null) {
            builder.append("price=");
            builder.append(price);
            builder.append(", ");
        }
        if (lastUpdate != null) {
            builder.append("lastUpdate=");
            builder.append(lastUpdate);
            builder.append(", ");
        }
        builder.append("quantity=");
        builder.append(quantity);
        builder.append("]");
        return builder.toString();
    }
}
