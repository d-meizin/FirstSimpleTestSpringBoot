package meizin.ltd.FirstSimpleTestSpringBoot.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import meizin.ltd.FirstSimpleTestSpringBoot.bean.CoffeeShop;
import meizin.ltd.FirstSimpleTestSpringBoot.model.CoffeeType;
import meizin.ltd.FirstSimpleTestSpringBoot.model.CoffeeOrder;

@ShellComponent
public class CoffeeCommands {
	
	private final CoffeeShop coffeeShop;
	
	public CoffeeCommands(CoffeeShop coffeeShop) {
		this.coffeeShop = coffeeShop;
		
	}
	
	@ShellMethod("Заказать кофе")
	public String orderCoffee(String coffeeType) {
		try {
			CoffeeOrder order = new CoffeeOrder(CoffeeType.valueOf(coffeeType.toUpperCase()));
			return coffeeShop.processOrder(order);
		} catch (IllegalArgumentException e) {
			return "Неверный тип кофе. Доступный тип: ESPRESSO, AMERICANO, LATTE, CAPPUCCINO";
		}
	}

}
