package ir.java.up.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
public class Person1 extends BaseEntity {

    @Column(length = 100,nullable = true)
    private String name;

    private String lastname;
}
