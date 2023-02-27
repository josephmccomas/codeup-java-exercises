package movies;

public class Movie {
//    Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these.
//    Create methods to access these properties and change them (getters and setters).

    public String name;

    public String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " -- " + category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


//    Download the MoviesArray file and save it as MoviesArray.java inside of movies.movies.
//    This class has a static method named findAll that will return an array of Movie objects.


}
