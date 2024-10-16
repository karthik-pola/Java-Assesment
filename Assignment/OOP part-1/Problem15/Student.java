import java.util.*;
public class Student {
int admin_no;
String stu_name;
String course_joined;
double fees_paid;

HashMap<String, Double> hm = new HashMap<String, Double>();



public Student(int admin_no, String stu_name, String course_joined, double fees_paid){
    
    this.admin_no = admin_no;
    this.stu_name = stu_name;
    this.course_joined = course_joined;
    this.fees_paid = fees_paid;

    hm.put("JAVA", 10.0);
    hm.put("PYTHON", 7.5);
}

    public Student(int admin_no, String stu_name, double fees_paid){
    
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = "JAVA";
        this.fees_paid = fees_paid;

        hm.put("JAVA", 10.0);
        hm.put("PYTHON", 7.5);
    }

    public double getTotalFee(){
        return hm.get(course_joined);
    }

    public double getDue(){
        return hm.get(course_joined) - this.fees_paid;
    }

    public double getFeePaid(){
        return this.fees_paid;
    }

    public void payment(int amount){
        this.fees_paid+=amount;
    }

}
