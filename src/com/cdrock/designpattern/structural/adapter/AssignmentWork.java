package com.cdrock.designpattern.structural.adapter;

public class AssignmentWork {
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    void writeAssignment(String str){
        System.out.println(str);
    }
}
