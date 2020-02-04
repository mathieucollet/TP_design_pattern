package fr.mds.designpattern.observertraining;

public class ObserverDemo {

    public static void main(String[] args) {
        School mds = new School("My Digital School");

        ClassRoom ten = new ClassRoom("10");
        ClassRoom eleven = new ClassRoom("11");
        ClassRoom twelve = new ClassRoom("12");
        ClassRoom thirtee = new ClassRoom("13");

        Teacher mick = new Teacher("Mickael");
        Teacher jonathan = new Teacher("Jonathan");
        Teacher guillaume = new Teacher("Guillaume");
        Teacher michel = new Teacher("Michel");

        Student jerem = new Student("Jerem");
        Student cedric = new Student("Cedric");
        Student eloise = new Student("Eloise");
        Student mathieu = new Student("Mathieu");

        Student brandon = new Student("Brandon");
        Student benoit = new Student("Benoit");
        Student tristan = new Student("Tristan");
        Student dimitry = new Student("Dimitry");

        Student charlesedouard = new Student("Charles-Édouard");
        Student paulhenry = new Student("Paul-Henry");
        Student grossemoula = new Student("Grosse-Moula");
        Student melvyn = new Student("Melvyn");

        Student ibrahima = new Student("Ibrahima");
        Student clement = new Student("Clément");
        Student erwin = new Student("Erwin");
        Student naig = new Student("Naïg");

        mds.attach(ten);
        mds.attach(eleven);
        mds.attach(twelve);
        mds.attach(thirtee);

        ten.attach(mick);
        eleven.attach(jonathan);
        twelve.attach(guillaume);
        thirtee.attach(michel);

        mick.attach(jerem);
        mick.attach(cedric);
        mick.attach(eloise);
        mick.attach(mathieu);

        jonathan.attach(brandon);
        jonathan.attach(benoit);
        jonathan.attach(tristan);
        jonathan.attach(dimitry);

        guillaume.attach(charlesedouard);
        guillaume.attach(paulhenry);
        guillaume.attach(grossemoula);
        guillaume.attach(melvyn);

        michel.attach(ibrahima);
        michel.attach(clement);
        michel.attach(erwin);
        michel.attach(naig);

        mds.notifyEvent("Alarme incendie en cours !!");

    }

}
