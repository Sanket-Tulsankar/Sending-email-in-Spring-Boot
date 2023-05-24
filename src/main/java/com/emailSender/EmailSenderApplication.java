package com.emailSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmailSenderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(EmailSenderApplication.class, args);
		
		EmailSenderService bean = configurableApplicationContext.getBean(EmailSenderService.class);

	bean.sendEmail("st517611@gmail.com", 
			"sankettulsankar009@gmail.com",
			"Mail sender from Spring Boot",
			"Hello,"+"\n\t"+" This is the test mail send through the java mail sender. "
			+ "\n\n"+"Thanks and Regards,"
			+ "\nSpring Boot");
	}

}
