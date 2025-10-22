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
} 
class pr002 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная величина iOb - " + iOb.inverse());

		System.out.println("Целая часть iOb - " + iOb.whole());

		System.out.println("Дробная часть iOb - " + iOb.dr());
		
		NumFns<Double> dOb = new NumFns<Double>(10.14);

		System.out.println("Обратная величина iOb - " + iOb.inverse());

		System.out.println("Целая часть iOb - " + iOb.whole());

		System.out.println("Дробная часть iOb - " + iOb.dr());

	}
} 
