package app.model;

import core.model.EntityBaseUUID;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "staff")
@Getter
public class User extends EntityBaseUUID {
    private static final long serialVersionUID = 3510710692742567314L;

}
