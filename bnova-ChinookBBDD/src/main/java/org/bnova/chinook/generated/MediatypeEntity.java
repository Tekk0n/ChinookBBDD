package org.bnova.chinook.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "mediatype", schema = "chinook", catalog = "")
public class MediatypeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "MediaTypeId")
    private int mediaTypeId;

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    @Basic
    @Column(name = "Name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediatypeEntity that = (MediatypeEntity) o;
        return mediaTypeId == that.mediaTypeId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaTypeId, name);
    }
}
