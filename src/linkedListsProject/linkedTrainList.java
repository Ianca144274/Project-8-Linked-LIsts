package linkedListsProject;

public class linkedTrainList {
	private int length;
	private Caboose head;

	public linkedTrainList() {
		this.length = 0;
		this.head = new Caboose(null, null);
	}
	
	public void addCaboose(Caboose c) {
		Caboose temp = new Caboose(c.getName(), c.getCargo());
		Caboose current = head;
		if (current != null) {
			while (current.getNextCaboose() != null) {
				current = current.getNextCaboose();
			}
			current.setNextCaboose(temp);
		}
	}

	public Caboose getHead() {
		return head;
	}
	
}
