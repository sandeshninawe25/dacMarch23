package problem3;

public class Book {
	
	private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;
	
    public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
	
	public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
	
	 public void decreaseQuantity(int quantity) {
	        if (this.quantity >= quantity) {
	            this.quantity -= quantity;
	        } else {
	            System.out.println("Error: Cannot decrease quantity below 0.");
	        }
	    }

	    public double getInventoryValue() {
	        return price * quantity;
	 
	   }
	    
	    public static void main(String[] args) {
			
	    	Book mybook= new Book("2states","Chetan Bhagat", "Rupa Publications Pvt. Ltd", "9780330512345", 2009, 20.25, 50);
	    	mybook.increaseQuantity(5);
	    	mybook.decreaseQuantity(2);
	    	
	    	double inventoryValue = mybook.getInventoryValue();
	    	System.out.println("Inventory value: " + inventoryValue);    
	    	
		}
	        
	}
    
    
    
    


