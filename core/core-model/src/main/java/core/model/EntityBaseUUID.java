package core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.ToString;

import java.io.Serial;
import java.util.UUID;

@Getter
@MappedSuperclass
@ToString(of = "id")
public abstract class EntityBaseUUID extends EntityBase<UUID> {
    @Serial
    private static final long serialVersionUID = 4957231455602524793L;

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @PrePersist
    void initId() {
        id = UUID.randomUUID();
    }
}
