package com.rim.food;

import java.util.Scanner;

public class FoodMenu {

	public void select(Food[] foods) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.주문 / 2.결산");
			int select = sc.nextInt();

			if (select == 1) {
				while (true) {

					for (int i = 0; i < foods.length; i++) {
						System.out.println((i + 1) + "." + foods[i].name);
					}
					int last = foods.length + 1;
					System.out.println(last + ".주문완료");

					int num = sc.nextInt();//메뉴번호 입력받기

					if (num != last) { // 주문완료가 아닌경우 수량 입력받기
						System.out.println("[" + foods[num - 1].name + "] 수량 : ");
						int add = sc.nextInt();
						if (foods[num - 1].stock - add < 0) {
							System.out.println(foods[num - 1].name + " 재고 없음!!!");
						} else {
							foods[num - 1].amount += add;
							foods[num - 1].stock -= add;
							foods[num - 1].sell += add;
						}
					} else {// 마지막 번호면
							// 영수증 출력 후 빠져나오기
						FoodView fv = new FoodView();
						fv.viewReceipt(foods); //영수증 출력
						
						for (int i = 0; i < foods.length; i++) {
							foods[i].amount = 0;
						}
						break;
					}

				}

			} else if (select == 2) {
				FoodView fv = new FoodView();
				fv.showResult(foods); //결산출력

				break;
			}
		}
	}

}
