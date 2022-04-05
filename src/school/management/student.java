package school.management;

public class student {


        private int id;
        private String name;
        private int grade;
        private int feespaid;
        private int feestotal;

        public student(int id,String name,int grade){

            this.id=id;
            this.name=name;
            this.grade= grade;
            feespaid=0;
            feestotal=30000;
        }
        /*
        setting up setters
         */

        public void setGrade(int grade){
            this.grade= grade;
        }
        public void payFee(int fee){
            feespaid+=fee;
            school.updateMoneyEarned(fee);
        }
        /*
        setting up getters
         */

    public int getFeespaid() {
        return feespaid;
    }

    public int getFeestotal() {
        return feestotal;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public int getReamainingFees(){
        return feestotal-feespaid;
    }
}
