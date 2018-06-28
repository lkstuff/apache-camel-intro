package com.lkstuff.orderfulfillment.order;

import com.lkstuff.orderfulfillment.customer.Customer;

import java.util.Date;

/**
 * Domain object for a Order
 */
public class Order{
    private long id;
    private Customer customer;
    private String orderNumber;
    private Date timeOrderPlaced;
    private Date lastUpdate;
    private String status;

    public Order(){
    }

    public Order(long id, Customer customer, String orderNumber, Date timeOrderPlaced, Date lastUpdate, String status){
        super();
        this.id = id;
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.timeOrderPlaced = timeOrderPlaced;
        this.lastUpdate = lastUpdate;
        this.status = status;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public String getOrderNumber(){
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber){
        this.orderNumber = orderNumber;
    }

    public Date getTimeOrderPlaced(){
        return timeOrderPlaced;
    }

    public void setTimeOrderPlaced(Date timeOrderPlaced){
        this.timeOrderPlaced = timeOrderPlaced;
    }

    public Date getLastUpdate(){
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Order [id=");
        builder.append(id);
        builder.append(", ");
        if (customer != null) {
            builder.append("customer=");
            builder.append(customer);
            builder.append(", ");
        }
        if (orderNumber != null) {
            builder.append("orderNumber=");
            builder.append(orderNumber);
            builder.append(", ");
        }
        if (timeOrderPlaced != null) {
            builder.append("timeOrderPlaced=");
            builder.append(timeOrderPlaced);
            builder.append(", ");
        }
        if (lastUpdate != null) {
            builder.append("lastUpdate=");
            builder.append(lastUpdate);
            builder.append(", ");
        }
        if (status != null) {
            builder.append("status=");
            builder.append(status);
            builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }
}
