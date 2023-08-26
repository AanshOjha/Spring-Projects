package com.javajourney.learnspringframework.examples.dependencies; 

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

// ================== Field Based Dependency Injection ====================================================================
	// @Autowired
	// Dependency1 dependency1;

	// @Autowired
	// Dependency2 dependency2;

// ========================== Constructor Based Dependency Injection ============================================================
// ====================================== Recommended =======================================================
	Dependency1 dependency1;

	Dependency2 dependency2;

	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass ");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

// =================== Getter & Setter Based Dependency Injection ===================================================================

	// Dependency1 dependency1;
	// Dependency2 dependency2;
	// @Autowired
	// public void setDependency1(Dependency1 dependency1) {
	// 	System.out.println("Setter Injection - setDependency1 ");
	// 	this.dependency1 = dependency1;
	// }

	// @Autowired
	// public void setDependency2(Dependency2 dependency2) {
	// 	System.out.println("Setter Injection - setDependency2 ");
	// 	this.dependency2 = dependency2;
	// }

// ======================================================================================

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjection {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependencyInjection.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));

		}
	}
}
