package com.kodilla.testing;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private int numberOfOrder;
    private LocalDate dateOfOrder;

    public Order(int numberOfOrder, int yearOfOrder, int monthOfOrder, int dayOfOrder){
        this.numberOfOrder = numberOfOrder;
        this.dateOfOrder = LocalDate.of(yearOfOrder, monthOfOrder, dayOfOrder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return numberOfOrder == order.numberOfOrder && Objects.equals(dateOfOrder, order.dateOfOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfOrder, dateOfOrder);
    }

    @Override
    public String toString(){
        return  "Date: " + dateOfOrder +
                "Number of order: " + numberOfOrder;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
