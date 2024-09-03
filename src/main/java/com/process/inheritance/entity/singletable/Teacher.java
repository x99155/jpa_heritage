package com.process.inheritance.entity.singletable;

import com.process.inheritance.entity.tableperclass.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
@DiscriminatorValue("PROF") // 4 octets la taille de la valeur
public class Teacher extends Person {
    private String course;
}
