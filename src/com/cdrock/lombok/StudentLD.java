package com.cdrock.lombok;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chandan Sharma
 */

@ToString
@Data
public class StudentLD {
    private @Getter int roll;
    private @Setter String name;
    private int age;


    public void setName(String cd) {
        this.name=cd;
    }

    public String getName() {
        return name;
    }
}
