package services;

import com.springframework.sfgpetclinic.model.Pet;
import java.util.Set;

/**
 * Created by @author issaclee725 on 5/02/2022
 */
public interface PetService {

    Pet findById(Long is);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
