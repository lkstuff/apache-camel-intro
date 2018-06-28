package com.lkstuff.orderfulfillment.catalog;


import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Customer entity.
 */

@Entity
@Table(name = "catalogItem")
@SequenceGenerator(name = "catalogitem_id_seq", sequenceName = "catalogitem_id_seq")
public class CatalogItemEntity implements Serializable{

    /*private static final long serialVersionUID = 4868640483823944904L;

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
    }*/
}
