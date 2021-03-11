package com.app;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Person implements Comparable<Person>{

    protected int m_id;
    protected float m_height;
    protected String m_name;

    public Person(int m_id, float m_height, String m_name) {
        this.m_id = m_id;
        this.m_height = m_height;
        this.m_name = m_name;
    }

    @Override
    public int compareTo(Person o) {
        return this.m_id-o.m_id;
    }


//    @Override
//    public int compareTo(Person o) {
//        if (this.m_height > o.m_height) {
//            return 1;
//        }
//        else if (this.m_height < o.m_height) {
//            return -1;
//        }
//        return 0;
//    }
}
