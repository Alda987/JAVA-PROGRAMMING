package demo;

 class Book {
	String title;
	String Author;
    double price;
    int quantity;

   Book(String title,String Author,double price,int quantity){
        this.title = title;
        this.Author = Author;
        this.price = price;
        this.quantity=quantity;
    }

    double calculateTotalvalue() {
        
          return price*quantity;
        }
        

    void displayBookDetails() {
        System.out.println("Author: " + Author);
        System.out.println("title: " + title);
        System.out.println("Quantity: " + quantity);
        System.out.println("total value: " + calculateTotalvalue());
        System.out.println("---------------------------");
    }
}
public class BookDemo {
	public static void main(String[] args) {
        Book b1=new Book ("malgudi days","R.K Narayan",299,3);
b1.displayBookDetails();
        
    }

}



