package sda.projects.travelagencybackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="cities")
public class City {
   @Id
   @GeneratedValue
   private Integer id;

   @Column(name="city_name")
   private String name;

   @ManyToOne
   @JoinColumn(name="country_id")
   private Country country;
}
