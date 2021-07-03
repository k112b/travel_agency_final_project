package sda.projects.travelagencybackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="countries")
public class Country {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="country_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="continent_id")
    private Continent continent;
}
