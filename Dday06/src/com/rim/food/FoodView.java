package com.rim.food;

public class FoodView {

	public void viewReceipt(Food[] foods) {
		int total = 0;
		
		System.out.println("====영수증====");
		for(int i=0;i<foods.length;i++) {
			System.out.println(foods[i].name+": " +foods[i].amount +" 소합계: " +foods[i].amount*foods[i].price
					+" (판매 :"+foods[i].sell + " 재고:"+foods[i].stock+")");
			total+= foods[i].amount*foods[i].price;
		}
		
		System.out.println("총 합계 : "+total);
		
	}
	
	public void showResult(Food[] foods) {
		int total =0;
		System.out.println("====최종결산====");
		
		for(int i=0;i<foods.length;i++) {
			System.out.println(foods[i].name+" 재고: "+ foods[i].stock +" 판매수:" +foods[i].sell);
			total+=foods[i].sell*foods[i].price;
			
		}
		
		System.out.println("총매출: "+ total);
	}
}
