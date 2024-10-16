import java.util.TreeSet;

public class Person implements Comparable<Person>{
    


    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        // Compare based on the name field
        // return this.name.compareTo(o.name);

        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }


    // public class Test{
        
    // }

    public static void main(String[] args) {
        Person p1 = new Person("karthik", 20);
        Person p2 = new Person("karthij", 21);
        TreeSet<Person> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.first().getName()+" "+ set.first().getAge());
        System.out.println(set.last().getName()+" "+ set.last().getAge());
    }

    
    
}
