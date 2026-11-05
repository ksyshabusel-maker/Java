package org.example;
import java.util.ArrayList;
import java.util.List;
public class FilmLibrary {
    private List<Film> films = new ArrayList<>();

    public void addFilm(Film film) {
        films.add(film);
    }

    public Film getFilmByYear(int year) throws FilmNotFoundException {
        for (Film film : films) {
            if (film.getYear() == year) {
                return film;
            }
        }
        throw new FilmNotFoundException("Фильм с годом выпуска " + year + " не найден в базе.");
    }

}
