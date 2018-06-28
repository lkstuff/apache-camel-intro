package com.lkstuff.orderfulfillment.order;

import com.lkstuff.orderfulfillment.catalog.CatalogItemEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orderItem")
@SequenceGenerator(name = "orderitem_id_seq", sequenceName = "orderitem_id_seq")
public class OrderItemEntity implements Serializable{

    private static final long serialVersionUID = -3950813201243788920L;

    private long id;
    private OrderEntity order;
    private CatalogItemEntity catalogItem;
    private String status;
    private BigDecimal price;
    private Date lastUpdate;
    private int quantity;

    public OrderItemEntity(){
    }

    public OrderItemEntity(long id, OrderEntity order, CatalogItemEntity catalogItem,
                           String status, Date lastUpdate, int quantity){
        this.id = id;
        this.order = order;
        this.catalogItem = catalogItem;
        this.status = status;
        this.lastUpdate = lastUpdate;
        this.quantity = quantity;
    }

    public OrderItemEntity(long id, OrderEntity order, CatalogItemEntity catalogItem,
                           String status, BigDecimal price, Date lastUpdate, int quantity){
        this.id = id;
        this.order = order;
        this.catalogItem = catalogItem;
        this.status = status;
        this.price = price;
        this.lastUpdate = lastUpdate;
        this.quantity = quantity;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderitem_id_seq")
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    public OrderEntity getOrder(){
        return order;
    }

    public void setOrder(OrderEntity order){
        this.order = order;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalogItem_id", nullable = false)
    public CatalogItemEntity getCatalogItem(){
        return catalogItem;
    }

    public void setCatalogItem(CatalogItemEntity catalogItem){
        this.catalogItem = catalogItem;
    }

    @Column(name = "status", nullable = false)
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @Column(name = "price", precision = 20, scale = 5)
    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastUpdate", nullable = false, length = 29)
    public Date getLastUpdate(){
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    @Column(name = "quantity", nullable = false)
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
