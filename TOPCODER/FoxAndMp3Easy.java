package com.lightea.tp;

public class FoxAndMp3Easy {

	public FoxAndMp3Easy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoxAndMp3Easy fame = new FoxAndMp3Easy();
		String[] result= fame.playList(30);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public String[] playList(int n)
	{
		String [] result;
		int size = 51 > n? n :50;
		result = new String[size];
		int tmp = 1;
		int count = 0;
		
		for (int i = 1; i < n+1 && count < 50; i++, count++) {
			result[i-1] = Integer.toString(tmp).concat(".mp3");
			if( tmp*10 < n + 1 )
			{
				tmp = tmp*10;
			}
			else
			{
				
			}
		}
		return result;
	}

}
