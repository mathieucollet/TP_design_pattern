package fr.mds.designpattern.observertraining;

public class Teacher extends BaseSubject<Student> implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("Le professeur " + this.name + " à reçu le message : " + msg);
        this.notifyEvent(msg);
    }
}
