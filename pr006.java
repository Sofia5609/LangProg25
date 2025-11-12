
class Rethrow {
	public static void main(String args[]) {
		int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom [] = {2, 0, 4, 4, 0, 8};

		for (int i=0; i<number.length; i++) {
			try {
				System.out.println(number[i] + " / " + denom[i] + "равно" + number[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				//Переход первого исключения
				System.out.println("Недопустимая арифметическая опе5рация");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				//Перехват исключения, связанного с выходом за границы массива
				System.out.println("Выход за границы массива");
				throw exc;
			}
		}
	}
}


class Pr006 {
	public static void main(String args[]) {
		try {
			Rethrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Выход за границы массива");
			System.out.println("Аварийное завершение программы");
		}
	}
}

