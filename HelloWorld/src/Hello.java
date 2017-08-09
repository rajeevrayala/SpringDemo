import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Hello {

	int id;
	String name;
	int salary;
	
	public Hello(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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
	public Hello(int id,String name){
		this.id=id;
		this.name=name;
	}
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return "name is "+this.name+" Salary is "+this.salary;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");

Hello h1= new Hello(30, "xyz",654);
Hello h2= new Hello(10, "abc",3456);
Hello h3= new Hello(20, "lmn",4655);
Hello h4= new Hello();

LinkedHashMap map= new LinkedHashMap();
map.put(30, h1);
map.put(10, h2);
map.put(20, h3);



Set<Entry<Integer,Hello>> hashset= map.entrySet();

for(Entry entry:hashset){
	System.out.println("Id is "+entry.getKey()+" "+ entry.getValue());
}
System.out.println("Welcome to GIT");
System.out.println("hgcdskhdf");
System.out.println("hi");
System.out.println("no");
System.out.println("new - branch");

/*Collection<Hello> list = (List<Hello>) map.values();
		ArrayList<Hello> a = new ArrayList<Hello>();
		a.addAll(list);
		System.out.println(a);*/
	}

}
