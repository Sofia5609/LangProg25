class Gen<T> {
	//Объявление переменной обобщённого типа
	T ob;
	//Определение конструктора, в качестве параметра указываем объект обобщенного типа
	Gen (T o) {
		ob = o;
	}
	//Метод,возввращающий объект 
	T getOb() {
		return ob;
	}
	//Метод,получающий информацию об имени типа
	void showType(){
		System.out.println("Тип Т: " + ob.getClass().getName());
	}
}
class TwoGen<T,V>{
	//Объявление переменной обобщённого типа
	T ob1;
	V ob2;
	//Определение конструктора, в качестве параметра указываем объект обобщенного типа
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;

	}
	//Метод,возввращающий объект
	T getOb1() {
		return ob1;
	}
	V getOb2() {
		return ob2;
	}
	//Метод,получающий информацию об имени типа
	void showTypes(){ 
		System.out.println("Тип Т: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	} 

}

class Pr001 {
	public static void main(String[] args) {
		Gen<String> strOb = new Gen<String>("Один обобщенный тип");
		String str = strOb.getOb();
		System.out.println("Значение обобщенного типа с одним параметром");
		//Создаем ссылочную переменную на объект типа Integer
		TwoGen<Integer, String> tgOb;
		//Присваиваем ссылку на новый объект
		tgOb = new TwoGen<Integer, String>(88, "Обобщения");
		//Выводим информацию о типе объекта
		tgOb.showTypes();
		//Присваиваем целой переменной значение,хранящееся в объекте
		int v = tgOb.getOb1();
		System.out.println("Значение: " + v);

		System.out.println();
		//Создаем ссылочную переменную на объект типа String и присваиваем ссылку на новый объект
		str = tgOb.getOb2();
		System.out.println("Значение в переменной str: " + str);
	}
}
