package test;

public class Laptops implements Comparable<Laptops> {
	String brand;
	int ram;
	int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Laptops(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptops lap2) {
		if (this.ram > lap2.ram) {
			return 1;
		} else if (this.ram < lap2.ram) {
			return -1;
		} else {
			return 0;
		}
	}

}
