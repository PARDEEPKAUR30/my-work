package assignment12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericArray<d> {
	d value;
    public GenericArray(d value){
    	this.value=value;
    }
    void setValue(d value) {
    this.value=value;
    }
    
    d getValue() {
    	return value;
    }
    }


