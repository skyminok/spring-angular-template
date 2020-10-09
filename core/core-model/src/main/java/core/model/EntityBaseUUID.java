package core.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

@Getter
@MappedSuperclass
public abstract class EntityBaseUUID extends EntityBase<UUID> {
    private static final long serialVersionUID = 4957231455602524793L;

    @Id
    @Column(name = "id")
    private UUID id;

    @PrePersist
    void initId() {
        id = UUID.randomUUID();
    }
}