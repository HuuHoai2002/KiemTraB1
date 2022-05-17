package B1_3;

public class Person {
	protected String name;
	protected String address;
	/**
	 * @param name
	 * @param address
	 */
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
