package eu.epfc.orders;

public class OrderLine {
    private String articleId;
    private String label;
    private double quantity;
    private double price;

    public OrderLine(String articleId, String label, double quantity, double price) {
        this.articleId = articleId;
        this.label = label;
        this.quantity = quantity;
        this.price = price;
    }


    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "articleId='" + articleId + '\'' +
                ", label='" + label + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
