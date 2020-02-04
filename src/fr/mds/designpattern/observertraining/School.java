package fr.mds.designpattern.observertraining;

import java.util.ArrayList;
import java.util.List;

public class School extends BaseSubject<ClassRoom> {

    private String name;

    public School(String name) {
        this.name = name;
    }
}
