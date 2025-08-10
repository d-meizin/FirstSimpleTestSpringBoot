package meizin.ltd.FirstSimpleTestSpringBoot.bean;

import org.springframework.stereotype.Component;
import meizin.ltd.FirstSimpleTestSpringBoot.model.CoffeeOrder;

@Component
public class CoffeeShop {
	public String processOrder(CoffeeOrder coffeeOrder) {
		return "Заказан кофе: " + coffeeOrder.coffeeType();
		
	}

}
