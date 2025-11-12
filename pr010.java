//Демонстрация множественного перехвата исключителных ситуаций
class Pr010 {
	public static void main(String[] args) {
		int a = 100; b = 0;
		int result;
		char[] chrs = {
		for (int i=0; i<2; i++) {'A', 'B', 'C'};
			try {
				if(i == 0)
					result = a/b;
				else
					chrs[6] = 'X';
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Перехвачено исключение: " + e);
			}
		}
		System.out.println("Выполнение кода множественного перехвата");
	}
}

