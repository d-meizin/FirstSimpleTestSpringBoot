package meizin.ltd.FirstSimpleTestSpringBoot.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import meizin.ltd.FirstSimpleTestSpringBoot.bean.CoffeeShop;
import meizin.ltd.FirstSimpleTestSpringBoot.model.CoffeeType;
import meizin.ltd.FirstSimpleTestSpringBoot.model.CoffeeOrder;

@ShellComponent
public class CoffeeCommands {
	
	private final CoffeeShop coffeeShop;
	
	public CoffeeCommands(CoffeeShop coffeeShop) {
		this.coffeeShop = coffeeShop;
		
	}
	
	@ShellMethod(value = "Заказать кофе", key = "zakaz")
	public String orderCoffee(@ShellOption(value = "t") String coffeeType) {
		try {
			CoffeeOrder order = new CoffeeOrder(CoffeeType.valueOf(coffeeType.toUpperCase()));
			return coffeeShop.processOrder(order);
		} catch (IllegalArgumentException e) {
			return "Неверный тип кофе. Доступный тип: ESPRESSO, AMERICANO, LATTE, CAPPUCCINO";
		}
	}

}
