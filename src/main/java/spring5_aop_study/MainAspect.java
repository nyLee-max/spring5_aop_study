package spring5_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.config.AppCtx;

public class MainAspect {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);){
//			RecCalculator cal = ctx.getBean("calculator", Calculator.class);
			RecCalculator cal = ctx.getBean("calculator", RecCalculator.class);
//			Calculator cal2 = ctx.getBean("calculator2", Calculator.class);
			long fiveFact = cal.factorial(5);
//			long fiveFact2 = cal.factorial(5);
			System.out.printf("cal.factorial(5) = %d%n", fiveFact);
			System.out.println(cal.getClass().getName());
//			System.out.printf("cal2.factorial(5) = %d%n", fiveFact2);
//			System.out.println(cal2.getClass().getName());
		}
	}
}
