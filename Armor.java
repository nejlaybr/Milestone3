package storefront;

/**
 * Represents an armor product in the store.
 * Extends the SalableProduct class.
 *
 * @author Nejla Yber
 */

public class Armor extends SalableProduct
{
    private int defense;

    /**
     * Creates an armor product.
     *
     * @param name Product name
     * @param description Product description
     * @param price Product price
     * @param quantity Product quantity
     * @param defense Armor defense value
     */
    
    public Armor(String name, String description,
                 double price, int quantity, int defense)
    {
        super(name, description, price, quantity);
        this.defense = defense;
    }

    public int getDefense()
    {
        return defense;
    }

    public void setDefense(int defense)
    {
        this.defense = defense;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Defense: " + defense;
    }
}