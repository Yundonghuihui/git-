package clock;

public class Disply {
	private int  value = 0;
	private int  limit = 0;
	
	public Disply(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if(value==limit)
			value=0;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
//		Disply d = new Disply(60);
		Disply d;
//		for (;;) {
//			d.increase();
//			System.out.println(d.getValue());
//		}
		System.out.println();
		
	}

}
