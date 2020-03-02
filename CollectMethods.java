import java.util.*;
import java.io.*;


class CollectMethods {

	ArrayList<Integer> list = new ArrayList<>();
	CollectMethods() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
	}

	void addElements(int n){
		list.add(n);
	}
	
	void removeElementsByIndex(int idx) {
		list.remove(idx); 
	}
	
	void fetchElements(int idx) {
		System.out.println(list.get(idx));
	}
	
	void displayElements() {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		} 
		System.out.println();
	}
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		CollectMethods obj = new CollectMethods();
		System.out.println("Methods provided by List");
		System.out.println("1. Adding	2.Removing through index	3.Fetching the desired index element	4. Displaying the list");
		System.out.println("Enter your option (1,2,3,4)/* (Enter -1 to stop operations) */");
		int opt = in.nextInt();
		while(opt != -1) {
			switch(opt) {
				case 1: System.out.println("Enter the element to add");
					int x = in.nextInt();
					obj.addElements(x);
					obj.displayElements();
					break;

				case 2: System.out.println("Enter the index to remove");
					int y = in.nextInt();
					obj.removeElementsByIndex(y);
					obj.displayElements();
					break;

				case 3: System.out.println("Enter the index to fetch");
					int p = in.nextInt();
					obj.fetchElements(p);
					//obj.displayElements();
					break;
				case 4: obj.displayElements();
					break;
				default: System.out.println("Invalid Option");
			}
			opt = in.nextInt();
		}
	}
}
