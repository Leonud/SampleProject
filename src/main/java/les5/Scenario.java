package les5;

public class Scenario {
    public static void main(String[] args) {
        Student st = new Student("Alex",15,10);
        Teacher teacher = new Teacher("Tamara",50,"maths");

        /*st.sayHello();
        teacher.sayHello();
        teacher.teach(st);*/

        polite[] people = new polite[5];

        people[0] = new Student("Student1",16 , 17);
        people[1] = new Student("Student",16 , 11);
        people[2] = new Teacher("Tamara",77,"Russia");
        people[3] = st;
        people[4] = teacher;

        for (int i = 0; i < people.length ; i++) {

        }
    }

    private static  void  makeSaySomething(polite polite){
        polite.goodBye();
    }
}
