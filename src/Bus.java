package busReservation;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int busNo,boolean ac,int capacity){
		this.setBusNo(busNo);
		this.setAc(ac);
		this.setCapacity(capacity);
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
