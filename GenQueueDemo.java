class GenQueueDemo {
	public static void main(String[] args) {
		//Создаем очередь из Integer
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> q = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("Операция с очередью из Integer");
		try {
			for(int i=0; i < 5; i++) {
				System.out.println("Добавляем " + i + "в очередь q");
				q.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for(int i = 0; i < 5; i++) {
				System.out.print("Извлечение элемента из q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		String[] sArray = new String[10];
		GenQueue<String> q1 = new GenQueue<String>(sArray);
		String sVal;
		System.out.println("Операция с очередью из String");
	 	try {
			for(int i = 0; i < 5; i++) {
				System.out.println("Добавляем строку" + i + " в очередь q1");
				q1.put("Строка " + i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		 System.out.println();
		 try {
			 for(int i=0; i < 5; i++) {
				  System.out.println("Извлечение строки из q1: ");
				  sVal = q1.get();
				  System.out.println(sVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//Создаем кольцевую очередь из Integer
		Integer[] iArray1 = new Integer[4];
		GenCirsQueue<Integer> q2 = new GenCirsQueue<Integer>(iArray1);
		System.out.println("Операция с кольцевой очередью из Integer");
		try {
			for(int i=0; i < 4; i++) {
				System.out.println("Добавляем " + i + "в очередь q2");
				q2.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for(int i = 0; i < 4; i++) {
				System.out.print("Извлечение элемента Integer из q2: ");
				iVal = q2.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
	}

}

