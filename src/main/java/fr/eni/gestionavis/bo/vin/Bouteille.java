package fr.eni.gestionavis.bo.vin;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder


@Document(collection = "bottles" )
public class Bouteille {

    @Id
    private BouteilleId id;


    @Field(name = "name")
    private String nom;


}
