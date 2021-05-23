package com.cdrock.designpattern.structural.adapter;

public class AssignmentMain {
    public static void main(String[] args) {

            Pen p = new PenAdapter();
            AssignmentWork aw = new AssignmentWork();
            aw.setPen(p);
            aw.writeAssignment("This is adapter");
    }

}
