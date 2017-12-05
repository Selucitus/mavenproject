package de.selu;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testQueue() {
		Queue basicQueue = new Queue(3);
		
		try {
			basicQueue.dequeue();
			fail("Nothing is queued. The function should not work");
		} catch (Exception e) {
			System.out.println("Error 1: " + e);
		}
		basicQueue.enqueue(1);
		assertEquals("Nothing is queued. The function should work", 1, basicQueue.dequeue());
		try {
			basicQueue.dequeue();
			fail("Nothing is queued. The function should not work");
		} catch (Exception e) {
			System.out.println("Error 2: " + e);
		}

		for (int j=0; j<3; ++j) {
			for (int i=1; i<=4; ++i)
				basicQueue.enqueue(i);
			try {
				assertEquals("Starting in the front of the Queue has bugs",1,basicQueue.dequeue());
				assertEquals("Starting in the front of the Queue has bugs",2,basicQueue.dequeue());
				assertEquals("Starting in the front of the Queue has bugs",4,basicQueue.dequeue());
				basicQueue.dequeue();
				fail("Nothing is queued. The function should not work");
			} catch (Exception e) {
				System.out.println("Error 3: " + e);
			}
		}
		
		for (int i = 0; i < 50; ++i)
			basicQueue.enqueue(i);
		int i = 0;		
		try {
			while (i<50)
				basicQueue.dequeue();
			fail("Nothing is queued. The function should not work");
		} catch (Exception e) {
			System.out.println("Error 4: " + e);
		}
		
		System.out.println("No Errors found.");
	}

}
