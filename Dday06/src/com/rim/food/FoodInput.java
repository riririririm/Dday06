package com.rim.food;

import java.util.Scanner;

public class FoodInput {
	
	public void input() {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("메뉴 수 입력:");
		int num = sc.nextInt();
		
		Food[] foods = new Food[num];
	
		
		for(int i=0;i<num;i++) {
			Food food = new Food();
			System.out.println("메뉴명:");
			food.name = sc.next();
			
			System.out.println("가격:");
			food.price = sc.nextInt();
			
			//System.out.println("수량:");
			//food.amount = sc.nextInt();
			
			System.out.println("재고수량:");
			food.stock =sc.nextInt();
			
			//System.out.println("판매수량:");
			//food.sell = sc.nextInt();
			
			foods[i]=food;			
			
		}
		FoodMenu fm = new FoodMenu();
		fm.select(foods);
		
	}

}
