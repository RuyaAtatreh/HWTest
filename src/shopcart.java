import java.util.ArrayList;

public class shopcart {
	ArrayList <book>shop= new ArrayList<book>();
public int getCount() {return shop.size();}


public double getTotal() {
	double total=0;
	for(book b:shop) {
		total+=b.getP();
	}
	
	return total;}


public void  AddBook(book b) {
	shop.add(b);
}
}
class book{
	
	String name;public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	double p;int count;
	
	
	
}