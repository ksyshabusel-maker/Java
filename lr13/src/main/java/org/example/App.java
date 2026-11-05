package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        FilmLibrary library = new FilmLibrary();

        System.out.println("Создание фильмов ");
        try {
            Film f1 = new Film("Начало", "Кристофер Нолан", 2010, 8.8, "Фантастика");
            Film f2 = new Film("Матрица", "Братья Вачовски", 1999, 8.7, "Боевик");
            Film f3 = new Film("Оппенгеймер", "Кристофер Нолан", 2023, 8.6, "Драма");

            library.addFilm(f1);
            library.addFilm(f2);
            library.addFilm(f3);

            System.out.println("Успешно добавлено 3 фильма.");

            System.out.println("Попытка создать фильм с неверным годом...");
            Film badFilm = new Film("Будущее", "Неизвестен", 2030, 5.0, "Фантастика");
            library.addFilm(badFilm);

        } catch (InvalidFilmDataException e) {
            System.out.println("Исключение при создании: " + e.getMessage());
        }

        System.out.println(" Поиск фильма по году ");
        try {
            int searchYear = 1999;
            System.out.println("Ищем фильм " + searchYear + " года...");
            Film foundFilm = library.getFilmByYear(searchYear);
            System.out.println("Найден: " + foundFilm);

            System.out.println("Ищем фильм 1985 года...");
            Film notFound = library.getFilmByYear(1985);
            System.out.println("Найден: " + notFound);

        } catch (FilmNotFoundException e) {
            System.out.println("Исключение при поиске: " + e.getMessage());
        }

        System.out.println("Обновление рейтинга");
        try {
            Film filmToUpdate = library.getFilmByYear(2010);

            filmToUpdate.updateRating(9.0);

            System.out.println("Попытка поставить рейтинг 15");
            filmToUpdate.updateRating(15.0);

        } catch (FilmNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (RatingUpdateException e) {
            System.out.println("Исключение при обновлении: " + e.getMessage());
        }

        System.out.println("Программа завершена.");

    }
}
