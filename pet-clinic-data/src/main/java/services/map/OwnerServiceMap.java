package services.map;

import com.springframework.sfgpetclinic.model.Owner;
import services.CrudService;

import java.util.Set;

/**
 * Created by @author issaclee725 on 6/02/2022
 */
public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
