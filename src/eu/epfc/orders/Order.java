package eu.epfc.orders;

import java.util.List;
import java.util.Date;
import java.util.List;

public class Order {
    private String nr;
    private Date date;

    private Supplier supplier;
    private List<OrderLine> orderLines;

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Order(String nr, Date date, Supplier supplier, List<OrderLine> orderLines) {
        this.nr = nr;
        this.date = date;
        this.supplier = supplier;
        this.orderLines = orderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nr='" + nr + '\'' +
                ", date=" + date +
                ", supplier=" + supplier +
                ", orderLines=" + orderLines +
                '}';
    }
}
