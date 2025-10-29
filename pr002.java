//Обобщенные типы ограничиваются только теми классами, которые расширяю класс Number
class NumFns<T extends Number> {
	T num;
	NumFns(T n) {
		num = n;
	}
	//Получение обратной величины num
	double inverse() {
		return 1/num.doubleValue();
	}
	//Получение целой части num
	int whole() {
		return num.intValue();
	}
	//Получение дробной части num
	double dr() {
		return num.doubleValue() - num.intValue();
	} 
	//Использование шаблонов аргументов
	boolean absEqual (NumFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}
	//При помощи конструкции "T, V extends  T" можно выполнять проверку совместимости типов присоздании новых объектов
	class A <T, V extends T> {
		T first;
		V second;

		A(T a, V b) {
			first = a;
			second = b;
		}
	}
//Использование ограниченных шаблонв
class B {
	//Родительский класс для B_A,B_B, B_C
}
class B_A extends B {
}
class B_B extends B {
}
class B_C extends B {
}
class BA {
	//Самостоятельный класс, не имеющий родственных чвязей с B
}
class Gen1<T> {
	T ob;

	Gen1(T o) {
		ob = o;
	}
}
class Test {
	static void test(Gen1<? extends B> o) {
	}
	static void test2(Gen1<? super B_A> o) {
	}
}
class GenMeth {
	//Метод, определяющий, совпадает ли содержимое двух массивов
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		//Сравнение длины массивов
		if(x.length != y.length)
			return false;

		for(int i=0; i < x.length; i++)
			if(!x[i].equals(y[i]))
				return false;
		return true;
	}
}

class pr002 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная величина iOb - " + iOb.inverse());

		System.out.println("Целая часть iOb - " + iOb.whole());

		System.out.println("Дробная часть iOb - " + iOb.dr());
		
		NumFns<Double> dOb = new NumFns<Double>(10.14);

		System.out.println("Обратная величина iOb - " + iOb.inverse());



		System.out.println("Дробная часть iOb - " + iOb.dr());

		//Проверка совместимости типов ри создании объектов класса A
		A<Integer, Integer> x = new A<Integer, Integer>(1,2);
		A<Number, Integer> y = new A<Number, Integer>(1.1,2);	
		//A<Number, String> z = new A<Number, String>(1.1,2)
		//Типы Number и String

	       NumFns<Integer> intOb = new NumFns<Integer>(6);
		NumFns<Double> doubleOb = new NumFns<Double>(-6.0);		
		NumFns<Long> longOb = new NumFns<Long>(5L);

		System.out.println();
		System.out.println("");
		if(intOb.absEqual(doubleOb))
			System.out.println("Абсолютные значения величин совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");
		System.out.println("Сравнение абсолютных значений intOb и longOb");
		if(intOb.absEqual(longOb))
			System.out.println("Абсолютные значения величин совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");

		B b1 = new B();
		B_A b2 = new B_A();
		B_B b3 = new B_B();
		B_C b4 = new B_C();
		BA ba1 = new BA();
		Gen1<B> w1 = new Gen1<B>(b1);
		Gen1<B_A> v2 = new Gen1<B_A>(b2);
		Gen1<B_B> v3 = new Gen1<B_B>(b3);
		Gen1<B_C> v4 = new Gen1<B_C>(b4);
		Gen1<BA> v5 = new Gen1<BA>(ba1);

		//тип параметра при вызове статического метода test() ограничивается шаблоном
		Test.test(w1);
		Test.test(v2);
		Test.test(v3);
		Test.test(v4);

		//Использование обобщенного метода arraysEqual(), определенного в классе GenMeth
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3 , 4, 5};
		Integer nums3[] = {1, 2, 7, 4, 5};
		Integer nums4[] = {1, 2, 7, 4, 5, 6};

		System.out.println("\nВызов обобщенного метода для сравнения массивов");
		if(GenMeth.arraysEqual(nums, nums))
			System.out.println("Массив nums совпадает сам с собой");
		if(GenMeth.arraysEqual(nums, nums2))
			System.out.println("Массив nums совпадает с nums2");
		if(GenMeth.arraysEqual(nums, nums3))
			System.out.println("Массив nums совпадает с nums3");
		if(GenMeth.arraysEqual(nums, nums4))
			System.out.println("Массив nums совпадает с nums4");

		String st1[] = {"Первая строка", "Вторая строка"};
		String st2[] = {"Первая строка", "Вторая строка"};
		String st3[] = {"Первая строка", "Вторая строка"};
		if(GenMeth.arraysEqual(st1, st2))
			System.out.println("Массив st1 совпадает с st2");
		if(GenMeth.arraysEqual(st1, st3))
			System.out.println("Массив st1 совпадает с st3");

		Double nums5[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		Double nums6[] = {1.1, 2.1, 3.1, 4.1, 5.1};
		if(GenMeth.arraysEqual(nums5, nums6))
			System.out.println("Массив nums5  совпадает с nums");
		if(GenMeth.arraysEqual(nums6, nums5))
			System.out.println("Массив nums6  совпадает с nums");
	}

}
