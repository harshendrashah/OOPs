package Lab2;

/**
 * Describes an invoice for a set of purchased products.
 * @author pm jat @ daiict
*/
public class Book {
    /**
	@return ISBN
    */
    public String getIsbn() {
        return isbn;
    }
    /**
	sets ISBN of a Book
	@param isbn
    */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
	@return Price
    */
    public double getPrice() {
        return price;
    }
    /**
	sets Price of a Book
	@param price
    */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
        @return title
    */
    public String getTitle() {
        return title;
    }
    /**
	sets Title of a Book
	@param title
    */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
	@return Quantity in Stock
    */
    public int getStock() {
        return qty;
    }
    /**
	sets Quantity in stock of Book
	@param qty
    */
    public void setStock(int qty) {
        this.qty = qty;
    }
    private String isbn = "";
    private String title = "";
    private double price = 0;
    private int qty = 0;
}

