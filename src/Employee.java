import com.sun.deploy.security.ruleset.RuleSetParser;

import javax.management.relation.Relation;

public  class Employee implements Rules{
    private String name;
    private int salary;
    public Employee(){
        this("no name",0);;
    }

    public  Employee(String inname,int insala){
        name = inname;
        salary=insala;

    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }


    public  String toString() {
        return "employee " + getName() + " 's salary number is " + getSalary();

    }}



