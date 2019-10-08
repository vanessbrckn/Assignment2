package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testAddingMachine() {
		AddingMachine one = new AddingMachine();
		assertNotNull(one);
		
	}

	@Test
	void testGetTotal() {
		AddingMachine one = new AddingMachine();
		int testTotal = one.getTotal();
		assertEquals(0, testTotal);
	}
	
	@Test
	void testGetTotalAdd()
	{
		AddingMachine two = new AddingMachine();
		two.add(2);
		int testTotal = two.getTotal();
		assertEquals(2, testTotal);
	}

	@Test
	void testAdd() {
		AddingMachine three = new AddingMachine();
		three.add(3);
		System.out.println(three.toString());
		
	}

	@Test
	void testSubtract() {
		AddingMachine four = new AddingMachine();
		four.subtract(1);
		int newTotal = four.getTotal();
		assertEquals(-1,newTotal);
	}

	@Test
	void testToString() {
		AddingMachine five = new AddingMachine();
		five.add(2);
		five.subtract(1);
		five.add(6);
		System.out.println(five.toString());
	}

	/*@Test
	void testClear() {
		fail("Not yet implemented");
	}*/

}
