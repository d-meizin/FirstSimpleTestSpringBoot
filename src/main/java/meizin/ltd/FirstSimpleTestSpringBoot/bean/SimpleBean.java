package meizin.ltd.FirstSimpleTestSpringBoot.bean;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class SimpleBean {
	
	@PostConstruct
	public void postConstruct() {
		System.out.println( "Post construct from SimpleBean");
	}
	
	public void printInfo() {
		System.out.println( "I'm simple bean!");
	}

}
