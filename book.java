


public class book {
    String title;
    String author;
    final int bookId;
    static  int bookCounter=1000;
    static final String LIBRARY_NAME = "cENTRAL LIBRARY";


    book() {
        this.title = title;
        this.author=author;
        this.bookId=bookCounter++;
        }
    book(String title,String author,int bookId) {
        this.title = title;
        this.author=author;
        this.bookId=bookCounter++;
        }
        
    public void displayinfo() {
    	System.out.println("TITLE"+title);
    	System.out.println("AUTHOR"+author);
    	System.out.println("ID"+bookId);
    	
        
      
    }
    
    public void displayinfo(boolean showLibrary) {
    	if (showLibrary==true) {
    		System.out.println("LIBRARY_NAME"+LIBRARY_NAME);
    	}
    	else {
    		System.out.println(" it is false");
    	}
    }
    
    public static void displaybooks() {
    	System.out.println("total books added"+(bookCounter -1000))  ;
    }
    



    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book("J.K ROWLING","HARRY POTTER",1001);
        book b3 = new book("AUTHOR CLONING","SHERLOCK HOMES",1003);
        book b4 = new book("R.K NARAYANAN","MALGAUNDI DAYS",1004);

        System.out.println("book info:");
        b1.displayinfo();
        
        System.out.println("book info:");
        b2.displayinfo(true);
        b2.displayinfo();
        
        System.out.println("book info:");
        b3.displayinfo(true);
        b3.displayinfo();
        
        System.out.println("book info:");
        b4.displayinfo(true);
        b4.displayinfo();
        System.out.println("book info:");
        book.displaybooks();
        
    }
}