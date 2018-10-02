package newpackage;

public class Coin {
	private String sideUp;

	public Coin(){
	    Double face =Math.random()*2;
	    int rf=face.intValue();
	    if(rf == 0){
	        sideUp = "heads";
	    }
	    else{
	        sideUp = "tails";
	    }
	    getSideUp();
	}
	
	public String getSideUp(){
	    return sideUp;
	    

	}
	
	
	}

