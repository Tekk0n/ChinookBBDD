package org.bnova.chinook.generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "album", schema = "chinook", catalog = "")
public class AlbumEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "AlbumId")
    private int albumId;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    @Basic
    @Column(name = "Title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "ArtistId")
    private int artistId;

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumEntity that = (AlbumEntity) o;
        return albumId == that.albumId && artistId == that.artistId && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, title, artistId);
    }
}
