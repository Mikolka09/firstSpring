package itstep.firstspring.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private  String title;
    private  String body;
    private  String imgUrl;
    private  String someF;

    //Реализовано благодаря Lombok
    //public Long getId() {
    //    return id;
    //}

    //public void setId(Long id) {
    //    this.id = id;
    //
}
