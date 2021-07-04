package sda.projects.travelagencybackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="board_basis_types")
public class BoardBasisTypes {
   @Id
   @GeneratedValue
   private Integer id;

   @Column(name="type_string")
   private String typeString;
}
