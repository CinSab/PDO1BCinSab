import java.util.Objects;

public class Album {

    private String artista;
    private String titulo;

    public Album(String artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(artista, album.artista) && Objects.equals(titulo, album.titulo);
    }


}
