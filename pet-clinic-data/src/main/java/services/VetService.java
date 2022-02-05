package services;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by @author issaclee725 on 5/02/2022
 */
public interface VetService {

    Vet findById(Long is);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
