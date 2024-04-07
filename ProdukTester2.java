* Nama  : Desvita Putri
   Kelas : MI 1C
   NIM   : 2301092008
   Tugas : Praktek PBO
*/

public class Product {
    // Instance field declarations
    private int itemNumber;
    private String productName;
    private int unitsInStock;
    private double pricePerUnit;

    // Default constructor
    public Product() {
        // Initialize fields to default values
        itemNumber = 0;
        productName = "";
        unitsInStock = 0;
        pricePerUnit = 0.0;
    }

    // Overloaded constructor
    public Product(int number, String name, int qty, double price) {
        this.itemNumber = number;
        this.productName = name;
        this.unitsInStock = qty;
        this.pricePerUnit = price;
    }

    
    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Item Number: " + itemNumber + "\n" +
               "Name: " + productName + "\n" +
               "Quantity in stock: " + unitsInStock + "\n" +
               "Price: $" + pricePerUnit;
    }
}