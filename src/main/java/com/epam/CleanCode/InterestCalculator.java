package com.epam.CleanCode;

class InterestCalculator{
	double simpleInterest(double principal,float rate,float time) {
		return (principal*rate*time)/100 ;
	}
	
	double compoundInterest(double principal,float rate,float time) {
		return principal*Math.pow((1+rate/100),time) ;
	}
}