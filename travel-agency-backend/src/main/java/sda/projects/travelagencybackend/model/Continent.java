package sda.projects.travelagencybackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="continents")
public class Continent {
   @Id
   @GeneratedValue
   private Integer id;

   @Column(name="continent_name")
   private String name;
}
