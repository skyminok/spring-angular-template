package core.model;

import java.io.Serializable;

public interface EntityObject<K> extends Serializable {
    K getId();
}
