package in.ac.sharda.Demo.domain;

public class Products {
	private String name,description;
	private int id;
	private int price;
	public Products(int i, int j, String string, String string2) {
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
		
	}
public String getDescription(){
	return description;
}
public void setdescription(String description){
	this.description=description;
}
public int getId(){
	return id;
}
public void setId(){
	this.id=id;
	
}
public int getPrice(){
	return price;
}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Products)
			return((Products)obj).getId() == id;
		return false;
	}
}


