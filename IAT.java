interface IAT {}

class Person implements IAT {
	String name;
	IAT mom;
	IAT dad;
	
	Person(String name, IAT mom, IAT dad){
		this.name = name;
		this.mom = mom;
		this.dad = dad;
	}
}

class Unknown implements IAT {
	Unknown() {}
}

class ExamplesIAT {
	ExamplesIAT() {}
	
	IAT unknown = new Unknown();
	
	IAT flor = new Person("Florinda", unknown, unknown);
	IAT jose = new Person("Jose", unknown, unknown);
	
	IAT angel = new Person("Angelita", unknown, unknown);
	IAT manuel = new Person("Manuel", unknown, unknown);
	
	IAT gen = new Person("Generee", flor, jose);
	IAT mark = new Person("Mark", angel, manuel);
	
	IAT aly = new Person("Alyssa", gen, mark);
}

