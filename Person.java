class Person {
	String name;
	int age;
	String sex;
	Address address;
	
	Person(String name, int age, String sex, Address address){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}
}

class Address {
	String city;
	String state;
	
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
}

class ExamplesPerson{
	ExamplesPerson() {}
	
	Address t = new Address("Warwick", "RI");
	Address p = new Address("Boston", "MA");
	Address d = new Address("Nashua", "NH");
	Address j = new Address("New York", "NY");
	Address a = new Address("Los Angeles", "CA");
	
	Person tim = new Person("Tim", 20, "M", this.t);
	Person pat = new Person("Pat", 19, "F", this.p);
	Person kim = new Person("Kim", 17, "F", this.p);
	Person dan = new Person("Dan", 22, "M", this.d);
	Person jez = new Person("Jezza", 19, "F",this.j);
	Person aly = new Person("Alyssa", 19, "F", this.a);
}
