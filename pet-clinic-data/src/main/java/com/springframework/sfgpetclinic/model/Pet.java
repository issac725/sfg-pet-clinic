package com.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by @author issaclee725 on 2/02/2022
 */
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate localDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
