package sda.projects.travelagencybackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="airports")
public class Airport {
   @Id
   @GeneratedValue
   private Integer id;

   @Column(name="name")
   private String name;

   @ManyToOne
   @JoinColumn(name="city_id")
   private City city;
}
