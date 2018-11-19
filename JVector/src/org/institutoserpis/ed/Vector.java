package org.institutoserpis.ed;

public class Vector {
	
    public static int indexOf(int[] v,int x) {
    	
    	int index=0;
    	for(int item : v)
    	System.out.println(item);
        while ( index < v.length && v[index]!=x) {
        	index++;	
        }
        if (index == v.length)
        	return -1;
        return index;
    }
    public static int min(int[] v) {
//    	int min=v[0];
//    	for (int i = 1; i < v.length; i++) 
//    		if(v[i]< min )
//    			  min=v[i];
    	int indexOfMin=indexOfMin(v);
        return v[indexOfMin];
    }
    
//    public static int indexOfMin(int[] v) {
//    	return indexOf(v,min(v));
//    }
    public static int indexOfMin(int[] v) {
    	int min=v[0], indice=0;
    	for (int i = 1; i < v.length; i++) 
    		if(v[i]< min ) {
    			  min=v[i];
    			  indice=i;
    		 }
        return indice;	
     }
    public static void sort(int[] v) {
    	int aux;
		for (int indexOfMin=0; indexOfMin < v.length-1; indexOfMin++) 
			for (int index=indexOfMin+1 ; index < v.length; index++)
				if (v[index] < v[indexOfMin]) {
					aux = v[indexOfMin];
					v[indexOfMin] = v[index];
					v[index] = aux;
				}
		System.out.println(v);
}
    
  
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v= new int[] {16,12,15,14, 17};
		
		int x=12;
		int index=indexOf(v,x);
		System.out.println("index="+ index);
		int min=min(v);
		int indexOfMin=indexOfMin(v);
		sort(v);
	}
}
