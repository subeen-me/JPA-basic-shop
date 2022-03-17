package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Movie extends Item{

    private String director;
    private String actror;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActror() {
        return actror;
    }

    public void setActror(String actror) {
        this.actror = actror;
    }
}
