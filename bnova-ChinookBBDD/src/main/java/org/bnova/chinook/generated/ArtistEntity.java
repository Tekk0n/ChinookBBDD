package org.bnova.chinook.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "artist", schema = "chinook", catalog = "")
public class ArtistEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "ArtistId")
    private int artistId;

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
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
        ArtistEntity that = (ArtistEntity) o;
        return artistId == that.artistId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, name);
    }
}
