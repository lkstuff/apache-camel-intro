package com.lkstuff.orderfulfillment.customer;

/**
 * Domain object for a Customer
 */
public class Customer{
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public Customer(){
    }

    public Customer(long id, String firstName, String lastName, String email){
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Customer [id=");
        builder.append(id);
        builder.append(", ");
        if (firstName != null) {
            builder.append("firstName=");
            builder.append(firstName);
            builder.append(", ");
        }
        if (lastName != null) {
            builder.append("lastName=");
            builder.append(lastName);
            builder.append(", ");
        }
        if (email != null) {
            builder.append("email=");
            builder.append(email);
        }
        builder.append("]");
        return builder.toString();
    }
}
