
public class FastFoodFactory {
	
	public FastFood getFastFood( String type) {
		switch(type){
			case "hamburger": return new Hamburger();
			case "sandwich": return new Sandwich();
			case "hot dog": return new HotDog();
			default: return null;
		}
	}
	
	public Drink getDrink( String type) {
		switch(type){
		case "soda": return new Soda();
		case "juice": return new Juice();
		case "beer": return new Beer();
		default: return null;
	}
	}

}
