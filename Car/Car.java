package com.app;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
public class Car implements Comparable<Car>{
    private String m_id;
    private String m_brand;
    private String m_model;
    private LocalDateTime m_creation;
    private String m_color;
    private Integer seats;

    public Car(String m_id, String m_brand, String m_model, LocalDateTime m_creation, String m_color, Integer seats) {
        this.m_id = m_id;
        this.m_brand = m_brand;
        this.m_model = m_model;
        this.m_creation = m_creation;
        this.m_color = m_color;
        this.seats = seats;
    }

    @Override
    public int compareTo(Car o) {
        return this.m_id.compareTo(o.m_id);
    }
}
