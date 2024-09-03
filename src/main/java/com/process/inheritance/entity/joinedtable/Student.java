package com.process.inheritance.entity.joinedtable;

import com.process.inheritance.entity.tableperclass.Person;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
public class Student extends Person {
    private double score;
}