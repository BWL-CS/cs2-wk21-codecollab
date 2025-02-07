import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // LOOP EXAMPLE #1
		ArrayList<Double> purchases = new ArrayList<Double>();
		purchases.add(550.99);
		purchases.add(42.99);
		purchases.add(25.50);
		double totalSpent = 0.0;
		for (Double value : purchases) {
			totalSpent += value;
		}
		System.out.println("Total money spent: $" + totalSpent);
		System.out.println("-----");

		// LOOP EXAMPLE #2
		ArrayList<Integer> test1Grades = new ArrayList<Integer>();
		ArrayList<Integer> test2Grades = new ArrayList<Integer>();
		test1Grades.add(88);
		test2Grades.add(100);
		test1Grades.add(80);
		test2Grades.add(72);
		test1Grades.add(70);
		test2Grades.add(90);
		int totalPoints = 0;
		for (int i = 0; i < test1Grades.size(); i++) {
			totalPoints += test1Grades.get(i) + test2Grades.get(i);
		}
		int numberOfGrades = test1Grades.size() * 2;
		System.out.println("Class average over two tests: " + totalPoints / numberOfGrades);
		System.out.println("-----");

		// LOOP EXAMPLE #3
		ArrayList<String> members = new ArrayList<String>();
		members.add("valkyrie");
		members.add("black panther");
		members.add("hulk");
		members.add("thanos");
		members.add("thor");
		System.out.println("Meet the Superhero Squad! Here are the member names: " + members);
		for (int i = 0; i < members.size(); i++) {
			String oldName = members.get(i);
			String newName = oldName.toUpperCase();
			members.set(i, newName);
		}
		System.out.println("Member names after looping: " + members);
		System.out.println("-----");

		// LOOP EXAMPLE #4
		boolean found = false;
		String badGuy = "THANOS";
		int index = 0;
		while (!found && index < members.size()) {
			if (members.get(index).equals(badGuy)) {
				members.remove(index);
				found = true;
			} else {
				index++;
			}
		}
		System.out.println("Members after removing the bad guy: " + members);
   }
}
