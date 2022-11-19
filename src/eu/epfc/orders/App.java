package eu.epfc.orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Supplier supplier = new Supplier("migro");
        OrderLine orderLine1 = new OrderLine("h2ok90", "Total lessive 5 kg", 100, 5);
        OrderLine orderLine2 = new OrderLine("h2ok90", "Total lessive 3 kg", 50, 3);
        List<OrderLine> orderLines = new ArrayList<> ();
        orderLines.add(orderLine1);
        orderLines.add(orderLine2);
        Order order = new Order("abc-123872", new Date(), supplier, orderLines);

//        Order order = JsonLoader.deserialize("./order.json"):

        System.out.println(order);
    }
}
