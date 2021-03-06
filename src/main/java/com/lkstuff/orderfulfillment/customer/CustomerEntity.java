package com.lkstuff.orderfulfillment.customer;

import com.lkstuff.orderfulfillment.order.OrderEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
@SequenceGenerator(name = "customer_id_seq", sequenceName = "customer_id_seq")
public class CustomerEntity implements Serializable{
    private static final long serialVersionUID = -7602916426025960936L;

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<OrderEntity> orders = new HashSet<OrderEntity>(0);

    public CustomerEntity(){
    }

    public CustomerEntity(long id, String firstName, String lastName, String email){
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public CustomerEntity(long id, String firstName, String lastName, String email, Set<OrderEntity> orders){
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.orders = orders;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @Column(name = "firstName", nullable = false)
    public String getFirstName(){
        return firstName;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    @Column(name = "lastName", nullable = false)
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Column(name = "email", nullable = false)
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    public Set<OrderEntity> getOrders(){
        return orders;
    }

    public void setOrders(Set<OrderEntity> orders){
        this.orders = orders;
    }
}
