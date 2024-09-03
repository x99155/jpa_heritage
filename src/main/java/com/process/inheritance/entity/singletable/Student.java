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
@DiscriminatorValue("ETUD") // 4 octets c'est ici la taille de la valeur qui sera incluse la colonne TYPE
public class Student extends Person {
    private double score;
}
