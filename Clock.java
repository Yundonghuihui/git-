//  git hub

package clock;


public class Clock {
    private Disply hour = new Disply(24);
    private Disply minute = new Disply(60);
    private Disply second = new Disply(60);
   
    public Clock(int hour, int minute, int second){
    	    this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    	     
    	
    }
    
    public void tick() {
    	  while ( true ) { 
    		  second.increase();
    		  if(second.getValue()==0) {
    			  minute.increase();
    		  }
	    	  
	    	  if(minute.getValue()==0) {
	    		  hour.increase();
	    	  }
	    	  System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue()
	    			 , second.getValue());
	  }
    }

	public static void main(String[] args) {
	
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();

	}

}
