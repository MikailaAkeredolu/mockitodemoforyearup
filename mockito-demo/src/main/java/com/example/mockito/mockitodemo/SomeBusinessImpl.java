package com.example.mockito.mockitodemo;
import org.springframework.beans.factory.annotation.Autowired;
public class SomeBusinessImpl {
	
	@Autowired
	private DataService dataService;

	int findTheGreatestValueInAnArray() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for (int value : data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	  }
}

