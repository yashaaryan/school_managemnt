package school.management;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        teacher lizzy=new teacher(1,"lizzy",600);
          teacher john =new teacher(2,"john",600);
          teacher mala=new teacher(3,"mala",800);

        List<teacher> teacherList=new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(john);
        teacherList.add(mala);

        student yash=new student(1,"yash",4);
        student rae=new student(2,"rae",6);

        student gill=new student(3,"gill",9);

        List<student> studentList=new ArrayList<>();
        studentList.add(yash);
        studentList.add(rae);

        studentList.add(gill);

        school bgs=new school(teacherList,studentList);



       yash.payFee(5000);

       rae.payFee(6000);
        System.out.println("bgs has earned:$"+bgs.getMoneyEarned());
        System.out.println("making bgs pay salary");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("money bgs has $"+bgs.getMoneyEarned());
        john.receiveSalary(john.getSalary());
        System.out.println("money bgs has $"+bgs.getMoneyEarned());



    }
}
