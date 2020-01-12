package opdracht2;

public class House {
	private Room kitchen = new Room("kitchen");
	private Room bathRoom = new Room("bathRoom");
	private Room livingRoom = new Room("livingRoom");
	private Room sleepingRoom = new Room("sleepingRoom");

	public Room getKitchen() {
		return kitchen;
	}

	public Room getBathRoom() {
		return bathRoom;
	}

	public Room getLivingRoom() {
		return livingRoom;
	}

	public Room getSleepingRoom() {
		return sleepingRoom;
	}

}
