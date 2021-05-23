package com.cdrock.designpattern.structural.adapter;

import com.cdrock.designpattern.structural.adapter2.PilotPen;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        //From some another package with different type
        pp.mark(str);
    }
}
