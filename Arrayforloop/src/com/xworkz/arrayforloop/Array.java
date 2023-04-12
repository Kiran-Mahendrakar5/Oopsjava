package com.xworkz.arrayforloop;

public class Array {
	public static void main(String[] args) {
		String[] animal = new String[5];
		String[] bird = new String[4];
		String[] train = new String[3];  //using new keyword
		String[] bike = new String[2];
		String[] car = new String[6];
	
		System.out.println(animal[4]);
		System.out.println(bird[3]);
		System.out.println(train[2]);    //using new keyword
		System.out.println(bike[1]);
		System.out.println(car[5]);
		

 String[] animals = {"Lion","Tiger","cow","Deer","Zebra","Bear","Elephant","Hyena","Monkey","Horse"};
 String[] birds = {"Peacock","pigeon","Rooster","Penguin","Parrot","Own","Vulture","Bat","Kingfisher","gull"};
 int[] accountNumber = {5821,1567,98779,1678,98787,167898,14568,9867,672687,13425};
 int[] carNumber = {1,2,3,13,5,6,7,8,15,10,17};
 int[] even= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 
 
 
  for(int i=carNumber.length-1;i>=0;i--) {   // jumping two numbers in reverse order
	  if(carNumber[i]  %2!=0 ) { 
		  System.out.println(carNumber[i]);
  }
}
  for(int i=0;i<carNumber.length;i++) {   //jumping two numbers
	  if(carNumber[i] %2!=0){
		  System.out.println(carNumber[i]);
	  }
  }
  
  for(int i=0;i<even.length;i++) {   //even number
	  if(even[i] %2==0) {
		  System.out.println(even[i]);
		  
	  }
  }
 
}
}


 

