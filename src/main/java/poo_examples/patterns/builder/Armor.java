package poo_examples.patterns.builder;

public enum Armor {

	CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

	private final String title;
	
	Armor(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}

	@Override
	public String toString() {
		return title;
	}
}