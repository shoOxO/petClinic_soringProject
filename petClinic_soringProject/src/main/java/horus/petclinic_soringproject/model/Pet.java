package horus.petclinic_soringproject.model;

import java.time.LocalDate;

public class Pet {
    private petType type;
    private Owner owner;
    private LocalDate birthDate;

    public void setType(petType type) {
        this.type = type;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
