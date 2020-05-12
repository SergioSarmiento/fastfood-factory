
public class Restaurant {
	public static void main(String[] args) {
		RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
		RestaurantAbstractFactory restaurantAbstractFactory = 
				restaurantFactoryProducer.getRestaurantAbstractFactory(2);
		System.out.println(restaurantAbstractFactory.getFastFood("pizza"));
		System.out.println(restaurantAbstractFactory.getDrink("beer"));
	}
}
