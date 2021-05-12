package spring5_aop_study;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.ExeTimeCalculator;
import spring5_aop_study.aop.ImpeCalculator;
import spring5_aop_study.aop.RecCalculator;

public class Main {
	public static void main(String[] args) {
		test01();

		int num = 5;
		long result = 0;

		ExeTimeCalculator impCalculator = new ExeTimeCalculator(new ImpeCalculator());
		result = impCalculator.factorial(num);
		System.out.printf("%d! = %d%n", num, result);

		ExeTimeCalculator recCalculator = new ExeTimeCalculator(new RecCalculator());
		result = recCalculator.factorial(num);
		System.out.printf("%d! = %d%n", num, result);

	}

	private static void test01() {
		int num = 5;
		long res;
		long start;
		long end;

		Calculator impeCal = new ImpeCalculator();
//		start = System.currentTimeMillis();
		res = impeCal.factorial(num);
//		end = System.currentTimeMillis();

//		System.out.printf("ImpeCalculator.factorial(%d) 실행시간 %d%n", num, (end - start));
		System.out.printf("%d! = %d%n", num, res);

		Calculator reccal = new RecCalculator();
//		start = System.currentTimeMillis();

		res = reccal.factorial(num);
//		end = System.currentTimeMillis();

//		System.out.printf("ImpeCalculator.factorial(%d) 실행시간 %d%n", num, (end - start));
		System.out.printf("%d! = %d%n", num, res);
	}

}
