package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void IndexOf() {
		int[] v= new int[] {16,12,15,14, 17};
		assertEquals(0, Vector.indexOf (v,16));
		assertEquals(2, Vector.indexOf (v,15));
		assertEquals(4, Vector.indexOf (v,17));
		assertEquals(-1, Vector.indexOf (v,33));
	}
	
	@Test
	void indexOfEmpty() {
	  int[] v= new int[] {};
	  assertEquals(-1, Vector.indexOf(v,22));
	}
	
	@Test
	void min(){
      assertEquals(12, Vector.min (new int[] {16, 12,15,14,17}));
      assertEquals(16, Vector.min (new int[] {16,32,18,23,17}));
      assertEquals(3, Vector.min (new int[] {18, 3,17}));
      assertEquals(17, Vector.min (new int[] {17}));
	}
	
    @Test
    void indexOfMin() {
    	 assertEquals(1, Vector.indexOfMin (new int[] {16, 12,15,14,17}));
    	 assertEquals(0, Vector.indexOfMin (new int[] {16, 23,17}));
    	 assertEquals(4, Vector.indexOfMin (new int[] {16, 23,14,32,6}));
    	 assertEquals(0, Vector.indexOfMin (new int[] {14,15}));
    	 assertEquals(1, Vector.indexOfMin (new int[] {15,14}));
    	 assertEquals(0, Vector.indexOfMin (new int[] {14}));
    }
    
}
