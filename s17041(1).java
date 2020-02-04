/*
author: Piotr Jarzyński
S17041
*/

import java.util.Scanner;

public class NajdluzszyPodciag {
	static int[] najdluzszypodciag={0,0};
	private static Scanner odczyt;

	public static void main(String[] args) {
		int suma=0;
		int dlugosc=0;
		int rodzajmono=0;
		odczyt = new Scanner(System.in); 
		String[] ciag=odczyt.nextLine().split(" ");
		
		for(int j=0;j<ciag.length;j++){
			for(int i=j;i<ciag.length-1;i++){
			if(Integer.parseInt(ciag[i])==Integer.parseInt(ciag[i+1])){
			suma+=Integer.parseInt(ciag[i]);
			dlugosc++;
			
			}else{
				if(Integer.parseInt(ciag[i])>Integer.parseInt(ciag[i+1]) && (rodzajmono==0 || rodzajmono==1))
				{
					rodzajmono=1;
					suma+=Integer.parseInt(ciag[i]);
					dlugosc++;
					
				}else{
				if(Integer.parseInt(ciag[i])<Integer.parseInt(ciag[i+1]) && (rodzajmono==0 || rodzajmono==2))
				{
					rodzajmono=2;
					suma+=Integer.parseInt(ciag[i]);
					dlugosc++;
					
				}else{
					rodzajmono=0;
					suma+=Integer.parseInt(ciag[i]);
					dlugosc++;
					if(dlugosc>najdluzszypodciag[0]){
						najdluzszypodciag[0]=dlugosc;
						najdluzszypodciag[1]=suma;
						
				}
					
					dlugosc=0;
					suma=0;

			}
				}
			}
			if(dlugosc>najdluzszypodciag[0]){
				najdluzszypodciag[0]=dlugosc;
				najdluzszypodciag[1]=suma;
				
		}
			
		}
		suma+=Integer.parseInt(ciag[ciag.length-1]);
		dlugosc++;
		rodzajmono=0;
		if(dlugosc>najdluzszypodciag[0]){
			najdluzszypodciag[0]=dlugosc;
			najdluzszypodciag[1]=suma;
			
	}
		suma=0;
		dlugosc=0;
		}
		System.out.println("długość "+ najdluzszypodciag[0]+", suma "+najdluzszypodciag[1]);
	}
}


