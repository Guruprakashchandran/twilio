package com.practice2;

import java.util.Scanner;

public class Permutation_To_FindSmallValue {

	public static void main(String[] args) {
		
		new Permutation_To_FindSmallValue().getInputs();
	}

	private void getInputs() {

		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.print("Enter Length : ");
			int length = scan.nextInt();
			int[] x = new int[length];
			int[] y = new int[length];
			for(int i = 0;i<length;++i) {
				
				x[i] = scan.nextInt();
			}
			for(int i = 0;i<length;++i) {
				
				y[i] = scan.nextInt();
			}
			findPermutations(x,y,0,length);
		}
		catch(Exception e) {
			
			System.out.println("Wrong Input!!!");
		}
		finally {
			
			scan.close();
		}
	}

	private void findPermutations(int[] x, int[] y,int l,int length) {

		try {
			
			for(int i = 0;i<length;++i) {
				
				
			}
		} catch (Exception e) {

		}
	}
}
