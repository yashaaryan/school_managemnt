package school.management;

import java.util.List;

public class school {


    private List<teacher> teacherList;
    private List<student> studentList;
    private static int  moneyEarned;
    private static int moneySpent;

    public school(List<teacher> teacherList, List<student> studentList) {
        this.teacherList = teacherList;
        this.studentList = studentList;
        moneyEarned=0;
        moneySpent=0;
    }
/*
setting up getters and setters.
 */
    public List<teacher> getTeacherList() {
        return teacherList;
    }

    public void addTeacherList(teacher teachers) {
        teacherList.add(teachers);
    }

    public List<student> getStudentList() {
        return studentList;
    }

    public void addStudentList(student students) {
        studentList.add(students);
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public static void updateMoneyEarned(int moneyEarn) {
        moneyEarned+=moneyEarn;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public static void updateMoneySpent(int moneySpent) {
        moneyEarned-=moneySpent;
    }
}
