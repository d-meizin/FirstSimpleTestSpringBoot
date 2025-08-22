package meizin.ltd.FirstSimpleTestSpringBoot.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

//import jakarta.annotation.PostConstruct;
import meizin.ltd.FirstSimpleTestSpringBoot.bean.CoffeeShop;
import meizin.ltd.FirstSimpleTestSpringBoot.model.CoffeeType;
import meizin.ltd.FirstSimpleTestSpringBoot.model.WantedCoffee;

@ShellComponent
public class CoffeeCommands {
	
	private final CoffeeShop coffeeShop;
/*	
	@PostConstruct
	public void postConstruct() {
		System.out.println( "Post construct from CoffeeCommands");
	}
*/	

	public CoffeeCommands(CoffeeShop coffeeShop) {
		this.coffeeShop = coffeeShop;
	}
	
	@ShellMethod(value = "Заказать кофе", key = "zakaz")
	public String orderCoffee(@ShellOption(value = "t") String coffeeType) {
		try {
			WantedCoffee wanted = new WantedCoffee(CoffeeType.valueOf(coffeeType.toUpperCase()));
			return coffeeShop.showOrder(wanted);
		} catch (IllegalArgumentException e) {
			return "Неверный тип кофе. Доступный тип: ESPRESSO, AMERICANO, LATTE, CAPPUCCINO";
		}
	}

}
