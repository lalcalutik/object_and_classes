public class Author {
    private String name;
    private String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() { return name; }

    private void  setName(String name) { this.name = name;}

    public String getSurname() { return surname;}

    public  void setSurname(String surname) { this.surname = surname;}
}


