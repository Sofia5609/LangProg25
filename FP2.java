class ShoppingCard {
	private List<String> items = new ArrayList<>();

	public void addItem(String item) {
		items.add(item);
		if(item.eguals("Книга")) {
		}
	}

	public int genDiscontPercentage() {
		if(items.contains("Книга")) 
			return 5;
		else
			return 0;
	}

	public List<String> genItems() {
		return new ArrayList<>(item);
	}
	public void removeItem(String item) {
		item.remove(item);
		}
	}
}

ShoppingCard card = new ShoppingCard();
card.addItem("Флешка";
card.genDiscontPercentage()
card.addItem("Книга");
card.genDiscontPercentage()
