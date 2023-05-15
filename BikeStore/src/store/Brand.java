package store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Brand {
	
	String newBrand3;
	
	
	public Brand(String brands) {
		this.newBrand3 = brands;
	}

	public String getBrands() {
		return newBrand3;
	}

	public void setBrands(String brands) {
		this.newBrand3 = brands;
	}
	
	
	public void showBrands() {
		String[] arrayBrands = {newBrand3};

	    for(int i=0;i<arrayBrands.length;i++) {
            System.out.println(arrayBrands[i]);
	    }
  
	    
	    
	}
}
