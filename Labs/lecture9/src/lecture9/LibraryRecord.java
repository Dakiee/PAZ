package lecture9; 
public class LibraryRecord {
	private String bookTitle;
	private String bookAuthor; 
	private String ISBN;
	private String publisher;
	private String publisheYear;
	private boolean isPublise; 
	public LibraryRecord(String bookTitle , String bookAuthor, String ISBN, String serialNumber,
			String publisher,String publisheYear, boolean isPublise) {
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.ISBN=ISBN;
		this.publisher=publisher;
		this.publisheYear=publisheYear;
		this.isPublise=isPublise;
}

	public LibraryRecord(String bookTitle , String bookAuthor, String ISBN, String serialNumber,
String publisher,String publisheYear) {

		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.ISBN=ISBN;
		this.publisher=publisher;
		this.publisheYear=publisheYear;
}

	public String getBookTitle() {
return bookTitle;
}
	public void setBookTitle(String bookTitle) {
this.bookTitle = bookTitle;
}
	public String getBookAuthor() {
return bookAuthor;
}
	public void setBookAuthor(String bookAuthor) {
this.bookAuthor = bookAuthor;
}
	public String getISBN() {
return ISBN;
}
	public void setISBN(String iSBN) {
ISBN = iSBN;
}
	public String getPublisher() {
return publisher;
}
	public void setPublisher(String publisher) {
this.publisher = publisher;
}
	public String getPublisheYear() {
return publisheYear;
}
	public void setPublisheYear(String publisheYear) {
this.publisheYear = publisheYear;
}
	public boolean isPublise() {
return isPublise;
}
	public void setPublise(boolean isPublise) {
		this.isPublise = isPublise;
}
	public String toString(){
		if(!this.isPublise){
			return this.bookAuthor+" "+this.bookTitle+" "+ this.ISBN+" "+this.publisher+" "
					+this.publisheYear ;
}	
		else return this.bookAuthor+" "+this.bookTitle+" "+ this.ISBN+" "+this.publisher+" "
		+this.publisheYear+" it's still being published";
}
}
