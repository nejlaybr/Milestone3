package storefront;

/**
 * Represents a health item in the store.
 * Extends the SalableProduct class.
 *
 * @author Nejla Yber
 */

public class Health extends SalableProduct
{
    private int healingPoints;

    /**
     * Creates a health item product.
     *
     * @param name Product name
     * @param description Product description
     * @param price Product price
     * @param quantity Product quantity
     * @param healingPoints Health restoration value
     */
    
    public Health(String name, String description,
                  double price, int quantity, int healingPoints)
    {
        super(name, description, price, quantity);
        this.healingPoints = healingPoints;
    }

    public int getHealingPoints()
    {
        return healingPoints;
    }

    public void setHealingPoints(int healingPoints)
    {
        this.healingPoints = healingPoints;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Healing: " + healingPoints;
    }
}