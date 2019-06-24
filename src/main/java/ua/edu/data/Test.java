package ua.edu.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tests")
public class Test implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "subject_id")
    private Long subjectId;
    @Column(name = "student_id")
    private Long studentId;
    @Column(name = "mark")
    private Long mark;
}
