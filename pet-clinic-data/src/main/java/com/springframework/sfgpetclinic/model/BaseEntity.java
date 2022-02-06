package com.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by @author issaclee725 on 5/02/2022
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
