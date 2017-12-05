package de.selu;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest {

	@Test
	public void testIstErstesHalbjahr() {
		assertTrue("Month 1 should be in the first half",(Util.istErstesHalbjahr(1)));
		assertTrue("Month 6 should be in the first half",(Util.istErstesHalbjahr(6)));
		assertTrue("Month 7 should NOT be in the first half",!(Util.istErstesHalbjahr(7)));
		assertTrue("Month 12 should NOT be in the first half",!(Util.istErstesHalbjahr(12)));
	}

}
