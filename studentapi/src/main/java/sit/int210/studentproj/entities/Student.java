package sit.int210.studentproj.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "STDID", nullable = false, length = 11)
    private String stdid;

    @Column(name = "FIRSTNAME", length = 50)
    private String firstname;

    @Column(name = "LASTNAME", length = 50)
    private String lastname;

    @Column(name = "MAJOR", length = 50)
    private String major;

}