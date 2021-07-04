package sda.projects.travelagencybackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="hotels")
public class Hotel {
   @Id
   @GeneratedValue
   private Integer id;

   @Column(name="number_of_stars")
   private Integer numberOfStars;

   @Column(name="name")
   private String name;

   @Column(name="description")
   private String description;

   @ManyToOne
   @JoinColumn(name="city_id")
   private City city;
}
