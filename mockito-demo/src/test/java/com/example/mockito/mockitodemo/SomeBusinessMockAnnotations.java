package com.example.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;


//Add runner annotation
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotations {

	//Mock the dataService
	@Mock
	DataService dataServiceMock;
	
	//Inject dataServiceMock into businessImpl
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void testfindTheGreatestValueInAnArray() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
		int result = businessImpl.findTheGreatestValueInAnArray();
		assertEquals(24, result);
	}
	
	@Test
	public void testfindTheGreatestValueInAnArrayWithOneElement() {
		when(dataServiceMock.retrieveAllData())
		.thenReturn(new int[] {15});
		int result = businessImpl.findTheGreatestValueInAnArray();
		assertEquals(15, result);
	}

}
