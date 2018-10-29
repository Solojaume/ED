package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClaseAProbarTest {

	@Test
	void main() {
		assertEquals(0, ClaseAProbar.VALOR_INICIAL);
		ClaseAProbar.main(null);
		assertEquals(100, ClaseAProbar.VALOR_INICIAL);
	}

}
