package advanceJavaExam;

	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;
	import java.util.TreeMap;
	public class TreeMap_Main {
	private Map map = null;
	public TreeMap_Main() {
	map = new TreeMap();
	}
	public void addItems() {
	TreeMap_Student stu1 = new TreeMap_Student(1, "BIJOY");
	map.put("1", stu1);
	TreeMap_Student stu2 = new TreeMap_Student(2, "Karthik");
	map.put("3", stu2);
	TreeMap_Student stu3 = new TreeMap_Student(3, "Dexter");
	map.put("0", stu3);
	TreeMap_Student stu4 = new TreeMap_Student(4, "JayaKrishnan");
	map.put("2", stu4);
	}
	public void displayItems() {
	Set set = map.entrySet();
	System.out.println("Size = " + set.size());
	Iterator i = set.iterator();
	while (i.hasNext()) {
	Map.Entry entry = (Map.Entry) i.next();
	System.out.print(entry.getKey() + ": ");
	System.out.println(entry.getValue());
	}
	}
	public static void main(String[] args) {
	TreeMap_Main main = new TreeMap_Main();
	main.addItems();
	main.displayItems();
	}
	}