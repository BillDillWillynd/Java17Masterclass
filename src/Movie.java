public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){
        return switch(type){
            case "Adventure" -> new Adventure(title);
            case "Comedy" -> new Comedy(title);
            case "ScienceFiction" -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

}

class Adventure extends Movie {
    public Adventure(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}
class Comedy extends Movie {
    public Comedy(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something funnier happens",
                "Happy Ending");
    }
}
class ScienceFiction extends Movie {
    public ScienceFiction(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}