package meizin.ltd.FirstSimpleTestSpringBoot.bean;

import org.springframework.stereotype.Component;

import meizin.ltd.FirstSimpleTestSpringBoot.model.WantedCoffee;

//import jakarta.annotation.PostConstruct;


@Component
public class CoffeeShop {
/*	
	@PostConstruct
	public void postConstruct() {
		System.out.println( "Post construct from CoffeeShop");
	}
*/	
	public String showOrder(WantedCoffee wantedCofee) {
		return "Заказан кофе: " + wantedCofee.coffeeType();
		
	}

}
