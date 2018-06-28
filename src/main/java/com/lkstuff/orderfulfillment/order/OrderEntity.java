package com.lkstuff.orderfulfillment.order;

import com.lkstuff.orderfulfillment.customer.CustomerEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "order")
@SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq")
public class OrderEntity implements Serializable{

    private static final long serialVersionUID = -8239299025198163223L;

    private long id;
    private CustomerEntity customer;
    private String orderNumber;
    private Date timeOrderPlaced;
    private Date lastUpdate;
    private String status;
    private Set<OrderItemEntity> orderItems = new HashSet<OrderItemEntity>(0);

    public OrderEntity(){
    }

    public OrderEntity(long id, CustomerEntity customer, String orderNumber, Date timeOrderPlaced,
                       Date lastUpdate, String status){
        super();
        this.id = id;
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.timeOrderPlaced = timeOrderPlaced;
        this.lastUpdate = lastUpdate;
        this.status = status;
    }

    public OrderEntity(long id, CustomerEntity customer, String orderNumber, Date timeOrderPlaced,
                       Date lastUpdate, String status, Set<OrderItemEntity> orderItems){
        this.id = id;
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.timeOrderPlaced = timeOrderPlaced;
        this.lastUpdate = lastUpdate;
        this.status = status;
        this.orderItems = orderItems;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    public CustomerEntity getCustomer(){
        return customer;
    }

    public void setCustomer(CustomerEntity customer){
        this.customer = customer;
    }

    @Column(name = "orderNumber", nullable = false)
    public String getOrderNumber(){
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber){
        this.orderNumber = orderNumber;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timeOrderPlaced", nullable = false, length = 29)
    public Date getTimeOrderPlaced(){
        return timeOrderPlaced;
    }

    public void setTimeOrderPlaced(Date timeOrderPlaced){
        this.timeOrderPlaced = timeOrderPlaced;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastUpdate", nullable = false, length = 29)
    public Date getLastUpdate(){
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    @Column(name = "status", nullable = false)
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    public Set<OrderItemEntity> getOrderItems(){
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemEntity> orderItems){
        this.orderItems = orderItems;
    }
}
