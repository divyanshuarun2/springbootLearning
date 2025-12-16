package com.springboot.learn;

import com.springboot.learn.Dec152025.ComponentVsBean;
import com.springboot.learn.Dec152025.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnApplication.class, args);
				context.getBean(ComponentVsBean.class).run();
		System.out.println(context.getBean(User1.class).toString());
	}

}
