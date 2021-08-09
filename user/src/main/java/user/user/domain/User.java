package user.user.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
}
