package com.lightea.tp;

import java.util.Iterator;

public class FoxAndGame {

	public FoxAndGame() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int countStars(String[] result) {
		int x = 0;
		for (String string : result) {
			for (int i = 0; i < string.length(); i++) {
				if(string.charAt(i) =='o')
					x++;
				else
					break;
			}
		}
		return x;			
		}
	}

