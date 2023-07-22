package net.njdevel.hikingtrails.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hiker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String first_name;
    private String last_name;
    private String address;
}
