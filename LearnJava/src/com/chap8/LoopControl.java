package com.chap8;

public class LoopControl {
	
	public static void main(String[] args) {
	
		System.out.println("Using break and continue: ");
		
		System.out.println("Starting loop");
		for(int i =0;i<7;i++){
			System.out.println("Start of loop: "+i);
			
			System.out.println("First test");
			if(i==1){
				System.out.println("Continue");
				continue;
			}
			
			System.out.println("Second test");
			if(i ==3){
				System.out.println("Break");
				break;
			}
			System.out.println("End of loop: "+i);
		}
	System.out.println("End of for loop or break encountered");	
	
	}

}
