class Gen<T> {
	/Объявление переменной обобщённого типа
	T ob;
	//Определение конструктора, в качестве параметра указываем объект обобщенного типа
	Gen (Т о) {
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
class Pr001 {
	public static void main(String[] args) {
		//Создаем ссылочную переменную на объект типа Integer
		Gen<Integer> iOb;
		//Присваиваем ссылку на новый объект
		iOb = new Gen<Integer>(88);
		//Выводим информацию о типе объекта
		iOb.showType();
		//Присваиваем целой переменной значение,хранящееся в объекте
		int v = iOb.getOb();
		System.out.println("Значение: " + v);

		System.out.println();
		//Создаем ссылочную переменную на объект типа String и присваиваем ссылку на новый объект
		Gen<String>strOb = new Gen<String>("Строка обобщённого класса");
		strOb.showType();
		String str = strOb.getOb();
		System.out.println("Значение в переменной str: " + str);
	}
} 
