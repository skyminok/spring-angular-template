package core.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Getter
@MappedSuperclass
public abstract class EntityBase<K extends Serializable> implements EntityObject<K> {
    @Serial
    private static final long serialVersionUID = 6536823447397066046L;

    @Column(name = "created_at", updatable = false)
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @PrePersist
    void onCreate() {
        ZonedDateTime now = ZonedDateTime.now();
        createdAt = now;
        updatedAt = now;
    }

    @PreUpdate
    void onUpdate() {
        updatedAt = ZonedDateTime.now();
    }
}
