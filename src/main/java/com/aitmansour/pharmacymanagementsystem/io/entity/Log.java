package com.aitmansour.pharmacymanagementsystem.io.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Log implements Serializable {

    @Serial
    private static final long serialVersionUID = -6946120796474185678L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String log_Id;

    private String description;

    private Date date;

    //private Set<Order> order_details;
    //private Set<Sells> sales_details;
    //private Set<Stock> stock_details;


    public String getLog_Id() {
        return log_Id;
    }

    public void setLog_Id(String log_Id) {
        this.log_Id = log_Id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Log{" +
                "log_Id='" + log_Id + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
