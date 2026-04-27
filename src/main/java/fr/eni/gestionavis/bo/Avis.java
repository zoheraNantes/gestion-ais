package fr.eni.gestionavis.bo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

@Document(collection = "review")
public class Avis {

        @Id
        private String id;

        @Field(name = "note")
        private int note;


        @Field(name = "commentary")
        private String commentaire;


        @Field(name = "date")
        private LocalDateTime date;

}
