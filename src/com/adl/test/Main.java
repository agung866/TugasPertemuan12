package com.adl.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main =new Main();
//		main.soal5();
//		main.soal6();
	//	main.soal7();

	}
	public void soal5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("input : ");
		int deret =scan.nextInt();
		
		int sblm =1;
		int skrng =1;
		int temp =0;
		System.out.print(skrng +" ");
		while(deret >= skrng) {
			System.out.print(skrng +" ");
			temp=skrng;
			skrng=skrng+sblm;
			sblm=temp;
		}
	}
	public void soal6() {

	Scanner scan = new Scanner(System.in);
	System.out.print("input : ");
	int input = scan.nextInt();

for (int i = 0; i < input; i++) {
	for (int j = 0; j < input; j++) {
		if (i>=j && i%2==0) {
		System.out.print("*");
		}
	}
	System.out.println();
}
		
	
}
	public void soal7() {
		
	}
}
