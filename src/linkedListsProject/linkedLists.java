package linkedListsProject;
import java.util.ArrayList;

public class linkedLists {
	
	public static void main(String[] args) {

		linkedTrainList train = new linkedTrainList();
		
		Caboose a = new Caboose("Austin,", " instruments");
		train.addCaboose(a);
		Caboose b = new Caboose("Barney,", " purple dinosaurs");
		train.addCaboose(b);
		Caboose c = new Caboose("Cleo,", " telephones");
		train.addCaboose(c);
		Caboose d = new Caboose("Dunkin,", " donuts");
		train.addCaboose(d);
		Caboose e = new Caboose("Echo,", " bats");
		train.addCaboose(e);
		Caboose f = new Caboose("Flo,", " jukeboxes");
		train.addCaboose(f);
		Caboose g = new Caboose("Geronimo,", " artifacts");
		train.addCaboose(g);
		Caboose h = new Caboose("Hologram,", " mirrors");
		train.addCaboose(h);
		
		cargoCheck(train);

	}
	
	public static void cargoCheck(linkedTrainList train) {
		Caboose current = train.getHead();
		while (current.hasNextCaboose()) {
			current = current.getNextCaboose();
			System.out.println(current.getName() + " " + current.getCargo());
		}
	}
}
