import static org.junit.Assert.*;

import org.junit.Test;

public class shopcartTest {

	@Test
	public void test() {
		shopcart sc=new shopcart ();
		assertTrue(sc.getCount()==0);
		assertTrue(sc.getTotal()==0);
	}
	
	@Test
	public void test1() {
		shopcart sc=new shopcart ();
		book b=new book();
		b.setName("Java Book");
		b.setP(127.0);
		b.setCount(1);
		sc.AddBook(b);
		assertTrue(sc.getCount()==1);
		assertTrue(sc.getTotal()==127.0);
	}
	
	@Test
	public void test2() {
		shopcart sc=new shopcart ();
		book b=new book();
		book b1=new book();
		b.setName("Java Book");
		b.setP(127.0);
		b.setCount(1);
		sc.AddBook(b);
		b1.setName("web book");
		b1.setP(100.0);
		b1.setCount(1);
		sc.AddBook(b1);
		assertTrue(sc.getCount()==2);
		assertTrue(sc.getTotal()==227.0);
	}
}
