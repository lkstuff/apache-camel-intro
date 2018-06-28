package com.lkstuff.orderfulfillment.catalog;


import com.lkstuff.orderfulfillment.order.OrderItemEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * CatalogItem entity.
 */

@Entity
@Table(name = "catalogItem")
@SequenceGenerator(name = "catalogitem_id_seq", sequenceName = "catalogitem_id_seq")
public class CatalogItemEntity implements Serializable{

    private static final long serialVersionUID = 4868640483823944904L;

    private long id;
    private String itemNumber;
    private String itemName;
    private String itemType;
    private Set<OrderItemEntity> orderItems = new HashSet<OrderItemEntity>(0);

    public CatalogItemEntity(){
    }

    public CatalogItemEntity(long id, String itemNumber, String itemName, String itemType, Set<OrderItemEntity> orderItems){
        this.id = id;
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemType = itemType;
        this.orderItems = orderItems;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catalogitem_id_seq")
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @Column(name = "itemNumber", nullable = false)
    public String getItemNumber(){
        return itemNumber;
    }

    public void setItemNumber(String itemNumber){
        this.itemNumber = itemNumber;
    }

    @Column(name = "itemName", nullable = false)
    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    @Column(name = "itemType", nullable = false)
    public String getItemType(){
        return itemType;
    }

    public void setItemType(String itemType){
        this.itemType = itemType;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "catalogItem")
    public Set<OrderItemEntity> getOrderItems(){
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemEntity> orderItems){
        this.orderItems = orderItems;
    }
}
