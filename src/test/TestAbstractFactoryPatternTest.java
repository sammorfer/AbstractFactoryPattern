package test;

import com.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mockitoSession;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;




import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;



/**
 * @author Samuel Moreno
 * Clase para realizar los test a la clase TestAbstractFactoryPattern
 */
@ExtendWith(MockitoExtension.class)
class TestAbstractFactoryPatternTest {
	
	@Mock(serializable = true)
	private static AbstractParserFactory Abstract1= Mockito.mock(AbstractParserFactory.class);
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
