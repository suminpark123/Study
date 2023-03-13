package java0823;

public class BookData {

	
	private String title;
	private int price;
	private String writer;
	
	
	public BookData(String title, int price, String writer) {
		
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String getWriter() {
		return writer;
	}
	@Override
	public String toString() {
		return "BookData [title=" + title + ", price=" + price + ", writer=" + writer + "]";
	}
	
	
}
