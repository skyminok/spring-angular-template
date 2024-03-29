package app.model;

import core.model.EntityBaseUUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString(of = "username", callSuper = true)
public class User extends EntityBaseUUID {
    @Serial
    private static final long serialVersionUID = 3510710692742567314L;

    @NotNull
    @Column(name = "username")
    private String username;

    @Column(name = "password_encoded")
    private String passwordEncoded;

    @Column(name = "password_salt")
    private String passwordSalt;
}
