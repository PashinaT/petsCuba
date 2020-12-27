package com.company.pets.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "PETS_TABLE_SHELTER")
@Entity(name = "pets_TableShelter")
public class TableShelter extends BaseIntegerIdEntity{
    private static final long serialVersionUID = 3296364234479659410L;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "NAME_SHELTER", length = 400)
    private String nameShelter;

    @Column(name = "ADDRESS_SHELTER", length = 2096)
    private String addressShelter;

    public String getAddressShelter() {
        return addressShelter;
    }

    public void setAddressShelter(String addressShelter) {
        this.addressShelter = addressShelter;
    }

    public String getNameShelter() {
        return nameShelter;
    }

    public void setNameShelter(String nameShelter) {
        this.nameShelter = nameShelter;
    }

}