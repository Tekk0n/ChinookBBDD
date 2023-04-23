package org.bnova.chinook.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "genre", schema = "chinook", catalog = "")
public class GenreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "GenreId")
    private int genreId;

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
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
        GenreEntity that = (GenreEntity) o;
        return genreId == that.genreId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, name);
    }
}
