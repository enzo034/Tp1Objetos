public class Item
{

    //Prop
    private int id;
    private String description;
    private int quantity;
    private double unitPrice;
    private double totalPrice;

    public Item()
    {
        id = -1;
        description = "none";
        quantity = 0;
        unitPrice = 0;
        totalPrice = 0;
    }

    public Item(int id, String description, int quantity, double unitPrice, double totalPrice)
    {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    //Setters
    public void setId(int id) { this.id = id; }
    public void setDescription(String description) { this.description = description; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    //Getters
    public int getId() { return id; }
    public String getDescription() { return description; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getTotalPrice() { return totalPrice; }

    public void calculateTotalPrice()
    {
        totalPrice = unitPrice*quantity;
    }

    public void showDataItem()
    {
        System.out.println("ItemVenta[id = " + id + ", description = " + description + ", quantity = " + quantity + ", unit price = " + unitPrice + ", total price = " + totalPrice + " ]");
    }

}