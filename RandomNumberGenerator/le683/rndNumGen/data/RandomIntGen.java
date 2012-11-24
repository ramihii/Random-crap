package le683.rndNumGen.data;

import java.util.Random;

public class RandomIntGen {
	
	Random rand = new Random();
	int lRN=-1;
	
	public int generateRandom(int highest){
		
		int rndNum=0;
		boolean randzd = false;
		rndNum=rand.nextInt(highest)+1;
		
		while(!randzd){
			
				if(lRN!=rndNum){
					lRN=rndNum;
					randzd=true;

				}else{
				lRN=rndNum;
					rndNum=rand.nextInt(highest)+1;

				}
			
		}
		return rndNum;
	}
	
}
