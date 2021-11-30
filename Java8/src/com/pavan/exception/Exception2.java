package com.pavan.exception;

public class Exception2 {

	private int[] tenure;
	private double principle_amount;
	private double interest_rate = 0.8;

	public Exception2(int[] tenurelist, double d) {
		this.tenure = tenure;
		this.principle_amount = principle_amount;
	}
	
	private void showInterest() throws ArithmeticException{
		
		double result = 0.0;
		
		try {
			for(int i : tenure) {
				result = this.principle_amount / i * this.interest_rate ;
				if( result == Double.POSITIVE_INFINITY) {
					throw new ArithmeticException("Invalid input");
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("End!");
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] tenurelist = {20,6,0,23};
		
		Exception2 exception2 = new Exception2(tenurelist,10000.00);
		
		try {
			exception2.showInterest();
		}catch(Exception e) {
			System.out.println("caught");
		}finally {
			System.out.println("Stop!");
		}
		
		
	}

	

}
