package services;

import com.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by @author issaclee725 on 5/02/2022
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
