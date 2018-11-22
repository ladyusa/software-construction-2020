package lec07io;

/**
 * This class stores restaurant information.
 *
 * @author Usa Sammapun
 * @since 0.5
 * @version 1.0
 *
 */
public class Restaurant {
	
	private String name;
	private String type;
	private String area;
	private int rating;
	private int priceLevel;

	/**
	 * Construct restaurant object.
	 *
	 * @param name name of restaurant
	 * @param type type of restaurant
	 * @param area area where the restaurant is located
	 */
	public Restaurant(String name, String type, String area) {
		this.name = name;
		this.type = type;
		this.area = area;
	}

	/**
	 * Return name of restaurant
	 * @return name
	 */
	public String getName() { return name; }
	public String getType() { return type; }
	public String getArea() { return area; }
	
	public void setRating(int rating) {
		this.rating = rating;
	}	

	public void setPriceLevel(int priceLevel) {
		this.priceLevel = priceLevel;
	}	
	
	public String toString() {
		return "Restaurant[name="+name+", type="+type+", area="+area+" ,rating="+rating+"]";
	}
}
