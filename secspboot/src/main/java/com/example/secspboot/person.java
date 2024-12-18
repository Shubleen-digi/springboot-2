package com.example.secspboot;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="table_1")
public class person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //autoincrement
   private Long id;
    private String  name ;
}
