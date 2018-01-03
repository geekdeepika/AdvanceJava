package advanceJavaExam;
public class TreeMap_Student {
private int id;
private String name;
public TreeMap_Student(int empId, String name) {
this.id = empId;
this.name = name;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String toString() {
return "Id = " + getId() + " ; Name = " + getName();
}
}