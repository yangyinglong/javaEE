/*
* created by yangyinglong at 20180515
* abstract and interface 
*/


public class abct_ince_test{
	public static void main(String[] args) {
		Door door_1 = new DoorWithoutRing("zhang");
		door_1.open();	
		Door door_2 = new DoorWithRing("li");
		// door_2.bilibili();	
		door_2.close();
		if(door_2 instanceof DoorWithRing){  
            DoorWithRing door_3 = (DoorWithRing)door_2; 
            door_3.make_vioce();
        } else {
        	System.out.println("door_3 can not instanceof door_2");
        }	

        abct_ince_test ab = new	abct_ince_test();
        ab.print_door_info(door_1);
	}

	private void print_door_info(Door door) {
		System.out.println("it is " + door.getOrder() + "'s door");
	}
	
}

class DoorWithoutRing extends Door {
	// private String order;

	public DoorWithoutRing(String order) {
		super(order);
	}

	@Override
	String getOrder() {
		return this.order;
	}

	@Override
	void open() {
		System.out.println("DoorWithoutRing has opened");
	}
	
	@Override
	void close() {
		System.out.println("DoorWithoutRing has closed");
	}
}

class DoorWithRing extends Door implements DingRing{
	// private String order;

	public DoorWithRing(String order) {
		super(order);
	}

	@Override
	String getOrder() {
		return this.order;
	}

	@Override
	void open() {
		System.out.println("DoorWithRing has opened");
	}

	@Override
	void close() {
		System.out.println("DoorWithRing has closed");
	}

	@Override
	public void make_vioce() {
		System.out.println(voice);
	}
}