interface Menu {}

class Soup implements Menu {
	Info info;
	boolean isVegetarian;
	
	Soup(Info info, boolean isVegetarian) {
		this.info = info;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements Menu {
	Info info;
	boolean isVegetarian;
	String dressing;
	
	Salad (Info info, boolean isVegetarian, String dressing) {
		this.info = info;
		this.isVegetarian = isVegetarian;
		this.dressing = dressing;
	}
}

class Sandwich implements Menu {
	Info info;
	String kindBread;
	Filling filling;
	
	Sandwich(Info info, String kindBread, Filling filling) {
		this.info = info;
		this.kindBread = kindBread;
		this.filling = filling;
	}
}

class Filling {
	String first;
	String second;
	
	Filling (String first, String second) {
		this.first = first;
		this.second = second;
	}
}

class Info {
	String name;
	int price;
	
	Info (String name, int price) {
		this.name = name;
		this.price = price;
	}
}


class ExamplesMenu {
	ExamplesMenu() {}
	
	Info soup = new Info("Bulalo", 50); 
	Info soup2 = new Info("Crab and Corn", 70);
	
	Info salad = new Info("Ceasar Salad", 100);
	Info salad2 = new Info("Macaroni", 90);
	
	Info sandwich = new Info("Ham and Cheese", 75);
	Info sandwich2 = new Info("Bacon and Egg", 100);
	
	
	Filling hc = new Filling("Ham", "Cheese");
	Filling be = new Filling("Bacon", "Egg");
	
	
	Menu so = new Soup(this.soup, false); 
	Menu so2 = new Soup(this.soup2, false);
	
	Menu sa = new Salad(this.salad, true, "Ceasar dressing");
	Menu sa2 = new Salad(this.salad2, true, "Mayonnaise");
	
	Menu sn = new Sandwich(this.sandwich, "Wheat Bread", this.hc);
	Menu sn2 = new Sandwich(this.sandwich2, "White Bread", this.be);
}
