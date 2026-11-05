package org.example;

public class Film {
    private String title;
    private String director;
    private int year;
    private double rating;
    private String genre;


    public Film(String title, String director, int year, double rating, String genre) throws InvalidFilmDataException {
        this.title = title;
        this.director = director;
        this.genre = genre;

        setYear(year);
        setRating(rating);
    }


    public void setYear(int year) throws InvalidFilmDataException {
        if (year < 1900 || year > 2025) {
            throw new wse("Ошибка"+ year);
           // throw new InvalidFilmDataException("Ошибка: Год должен быть в диапазоне от 1900 до 2025. Вы ввели: " + year);
        }
        this.year = year;
    }


    public void setRating(double rating) throws InvalidFilmDataException {
        if (rating < 1 || rating > 10) {
            throw new InvalidFilmDataException("Ошибка: Рейтинг должен быть от 1 до 10. Вы ввели: " + rating);
        }
        this.rating = rating;
    }

    public void updateRating(double newRating) throws RatingUpdateException {
        if (newRating < 1 || newRating > 10) {
            throw new RatingUpdateException("Ошибка обновления: недопустимый рейтинг " + newRating + " (допустимо 1-10).");
        }
        this.rating = newRating;
        System.out.println("Рейтинг фильма \"" + title + "\" успешно обновлен на " + newRating);
    }


    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Фильм: " + title + " (реж. " + director + ", " + year + " г., жанр: " + genre + ", рейтинг: " + rating + ")";
    }
}