package ru.yandex.later.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "users", schema = "public")
@Getter
@Setter
@ToString
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firs_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @Column(name = "registration_date")
    private Instant registrationDate = Instant.now();
    @Enumerated(EnumType.STRING)
    private UserState userState;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        return id != null && id.equals(((User) o).getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
