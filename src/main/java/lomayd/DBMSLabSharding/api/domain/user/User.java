package lomayd.DBMSLabSharding.api.domain.user;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="User")
public class User {

    @Id
    private String id;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String nickname;

    @Column
    private String email;

    @Column
    private Integer age;
}
