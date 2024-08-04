public class Book {
     int id;
     String specialization;
     String author;
     int publicationDate;
     String name;


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;

    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdBook() {

        return id;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationDate() {
        return publicationDate;
    }
    public String getName() {
        return name;
    }


}

