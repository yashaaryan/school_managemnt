package school.management;

public class teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned=0;
    }

    /*
    setting up getters
     */

    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    /*
    setting up setters
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned+=salary;
        school.updateMoneySpent(salary);
    }
}
