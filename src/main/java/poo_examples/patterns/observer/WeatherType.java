package poo_examples.patterns.observer;

public enum WeatherType {
	SUNNY("SUNNY"), RAINY("RAINY"), WINDY("WINDY"), COLD("COLD");

	private final String description;

	WeatherType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
