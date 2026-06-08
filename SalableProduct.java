package storefront;

/**
 * Base class for all products available in the store.
 * Contains common product information such as name,
 * description, price, and quantity.
 *
 * @author Nejla Yber
 */

public class SalableProduct implements Comparable<SalableProduct>
{
    // Variables
    private String name;
    private String description;
    private double price;
    private int quantity;

    // Constructor
    /**
     * Creates a salable product.
     *
     * @param name Product name
     * @param description Product description
     * @param price Product price
     * @param quantity Product quantity
     */
    public SalableProduct(String name, String description, double price, int quantity)
    {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
   
    public String getName()
    {
        return name;
    }
       
    public String getDescription()
    {
        return description;
    }
      
    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    // Setter
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // Display product
    
    public void displayProduct()
    {
        System.out.println(name + " - " + description);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

    @Override
    public int compareTo(SalableProduct other)
    {
        int result = this.name.compareToIgnoreCase(other.name);

        if (result != 0)
        {
            return result;
        }

        return Double.compare(this.price, other.price);
        
         }
    }