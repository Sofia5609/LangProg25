class Gen<T> {
	T ob ;
	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}

	void showType()
		System.out.println("Тип Т: " + jb.getClass().getName());
	}
}
class Pr001 {
	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.get();
		System.out.println("Значение: " + v);
	}
}  \
