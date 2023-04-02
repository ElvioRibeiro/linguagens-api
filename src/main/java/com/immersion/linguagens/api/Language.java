package com.immersion.linguagens.api;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dbLang")
public class Language {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    
    public Language(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public Language() {
    }



    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }

    public String getId() {
        return id;
    }


    

    
}
