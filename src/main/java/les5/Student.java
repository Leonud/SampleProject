package les5;

public class Student extends Human implements  polite {
    private int form;

    public Student (String name,int age,int form){
        super(name,age);
        this.form = form;
    }

    public int getForm() {
        return form;
    }

    public void goodBye() {
        System.out.println("Пока пока");
    }
}
