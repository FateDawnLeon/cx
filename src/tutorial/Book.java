package tutorial;

import java.sql.Date;

public class Book {
        private String isbn;
        private String title;
        private String publisher;
        private Date publishDate;
        private int authorID;
        private float price;
        
        public String getIsbn(){
        	return isbn;
        }
        public String getTitle(){
        	return title;
        }
        public String getPublisher(){
        	return publisher;
        }
        public Date getPublishDate(){
        	return publishDate;
        }
        public int getAuthorID(){
        	return authorID;
        }
        public float getPrice(){
        	return price;
        }
        
        public void setIsbn(String isbn){
        	this.isbn = isbn;
        }
        public void setTitle(String title){
        	this.title = title;
        }
        public void setPublisher(String publisher){
        	this.publisher = publisher;
        }
        public void setPublishDate(Date publishDate){
        	this.publishDate = publishDate;
        }
        public void setAuthorID(int authorID){
        	this.authorID = authorID;
		}
        public void setPrice(float price){
        	this.price = price;
        }
        
        public String execute(){
        	return "success";
        }
        
        public String deleteBook(){
        	return "";
        }
        
        public String addBook(){
        	return "";
        }
        
        public String updateBook(){
        	return "";
        }
        
}
