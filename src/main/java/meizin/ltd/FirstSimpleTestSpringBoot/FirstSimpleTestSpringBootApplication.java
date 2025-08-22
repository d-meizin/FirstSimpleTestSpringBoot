package meizin.ltd.FirstSimpleTestSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import meizin.ltd.FirstSimpleTestSpringBoot.bean.SimpleBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FirstSimpleTestSpringBootApplication {
/*	
	@Autowired
	private SimpleBean simpleBean;
*/
	public static void main(String[] args) {
		SpringApplication.run(FirstSimpleTestSpringBootApplication.class, args);
	}
/*	
	@EventListener(ApplicationReadyEvent.class)
	public void onReady(ApplicationReadyEvent event) {
		System.out.println("Ready! Time taken: " + event.getTimeTaken().toMillis());
		
		simpleBean.printInfo();
	}
*/
}
