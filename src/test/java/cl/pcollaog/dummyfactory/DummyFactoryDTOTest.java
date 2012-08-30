package cl.pcollaog.dummyfactory;

import org.junit.Assert;
import org.junit.Test;

import cl.pcollaog.dummyfactory.dto.DummyDTO;

/**
 * @author pcollaog
 * 
 */
public class DummyFactoryDTOTest {

	@Test
	public void testDummyFactoryDTO() {
		DummyDTO dummyDTO = DummyFactory.createDummy(DummyDTO.class);
		Assert.assertNotNull(dummyDTO);
	}


}
