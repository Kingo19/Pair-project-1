package com.techelevator.crm;
import com.techelevator.crm.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {

    @Test
    public void petListVaccination() {
        Pet pet1 = new Pet("Buchi", "Dog");
        List<String> vaccination = new ArrayList<String>();
        vaccination.add("Rabis");
        vaccination.add("Bambule");
        pet1.setVaccinations(vaccination);

        String result = pet1.listVaccinations();
        Assertions.assertEquals("Rabis, Bambule", result);
    }
}