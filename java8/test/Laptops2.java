package test;

public class Laptops2  {
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

	public Laptops2(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}


}
