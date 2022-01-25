package predicates;

public class Product {
	
	private String name;
	private int price;
	private String category;
	private int grade;
	
	
	public Product(String name, int price, String category, int grade) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public String getCategory() {
		return category;
	}


	public int getGrade() {
		return grade;
	}
}
