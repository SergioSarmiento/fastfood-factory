
public class Restaurant2Factory extends RestaurantAbstractFactory {

	@Override
	FastFood getFastFood(String type) {
		switch(type) {
			case "pizza": return new Pizza();
			default: return null;
		}
	}

	@Override
	Drink getDrink(String type) {
		switch(type) {
		case "juice": return new Juice();
		case "beer": return new Beer();
		default: return null;
	}
	}

}