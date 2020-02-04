package fr.mds.designpattern.observertraining;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom extends BaseSubject<Teacher> implements Observer {

    private String name;

    public ClassRoom(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("La salle n°" + this.name + " reçoit le message : " + msg);
        this.notifyEvent(msg);
    }
}
