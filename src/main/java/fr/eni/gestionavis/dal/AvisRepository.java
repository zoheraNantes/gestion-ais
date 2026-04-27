package fr.eni.gestionavis.dal;

import fr.eni.gestionavis.bo.Avis;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AvisRepository extends Repository<Avis, String> {
    Avis save(Avis avis);

    List<Avis> findAll();
}
