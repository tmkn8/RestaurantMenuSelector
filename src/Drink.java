/**
 * Starter is type of a course.
 * 
 * @author Tomasz Knapik <u1562595@unimail.hud.ac.uk>
 *
 */
public class Drink extends Course {

	/**
	 * Constructor inherited from the superclass.
	 * 
	 * @param name
	 * @param price
	 * @param calories
	 * @param description
	 * @param nutFree
	 * @param vegan
	 * @param vegetarian
	 * @param glutenFree
	 * @throws Exception
	 */
	public Drink(String name, Double price, int calories, String description, Boolean nutFree, Boolean vegan,
			Boolean vegetarian, Boolean glutenFree) throws Exception {
		super(name, price, calories, description, nutFree, vegan, vegetarian, glutenFree);
	}

	/**
	 * Gets a course type name.
	 * 
	 * @return
	 */
	public static String getCourseTypeNameOfClass() {
		return "Drinks";
	}

}
