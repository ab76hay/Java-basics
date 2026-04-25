class book{
    
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;
    static{
        totalNoOfBooks = 0;
    }
        {    //object init
            totalNoOfBooks++;
        }
        Book(String author, String title, String isbn){
              this.isbn = isbn;
              this.title = title;
              this.author = author;
        }
        Book(String isbn){
            thi(isbn, title="unkonown", author="unknown");
            
        }
         static int getTotalNoOfBooks(){
            return totalNoOfBooks;
         }
         void borrowbook(){
            if(isBorrow){
                System.out.println("book is akready borrowed");
            }else{
                this.isBorrowed = true;
                System.out.println("enjoy");
            }
        
         }
          void returnBook(){
            if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed");
            
          } else {
            System.out.println("already in library");
          }
        } 
        public static void main(String[] args){
            Book designOfThings = new Book("1","Design","Author");
           Book myBook = new Book("2");
            System.out.println(Book.getTotalNoOfBooks());
            designOfThings.borrowbook();
            myBook.borrowBook();
            designOfThings.BorrowBook();
            designOfThings.returnBook();
             designOfThings.returnBook(); 

        }
    }