package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemStockTest {
	Item item1 = new Item("book", 100);
	Item item2 = new Item("CD", 250);
	
	@Test
	void testitemStock1() {
		ItemStock itemStock = new ItemStock();
		int result = itemStock.getNum(item1);
		assertEquals(0, result, "testitemStock1_Error");
	}

	@Test
	void testitemStock2() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		int result = itemStock.getNum(item1);
		assertEquals(1, result, "testitemStock2_Error");
	}
	
	@Test
	void testitemStock3() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		
		int result = itemStock.getNum(item1);
		assertEquals(1, result, "testitemStock3_Error");
	}
	
	@Test
	void testitemStock4() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		
		itemStock.add(item1);
		int result = itemStock.getNum(item1);
		assertEquals(2, result, "testitemStock4_Error");
	}

	@Test
	void testitemStock5() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		
		itemStock.add(item2);
		int result = itemStock.getNum(item2);
		assertEquals(1, result, "testitemStock4_Error");
	}
}
