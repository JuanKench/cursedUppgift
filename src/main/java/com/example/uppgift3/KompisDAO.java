package com.example.uppgift3;

import java.util.ArrayList;
import java.util.List;


public class KompisDAO {
    public List<PhoneBook> getAllKompis() {
        List<PhoneBook> kompis = new ArrayList<>();

        PhoneBook k1 = new PhoneBook("Makan", 213323, 1);
        PhoneBook k2 = new PhoneBook("Åklagaren", 2131243, 2);
        PhoneBook k3 = new PhoneBook("Bertil", 213325, 3);
        PhoneBook k4 = new PhoneBook("Skogens kånugn", 23452, 4);
        PhoneBook k5 = new PhoneBook("maan", 3245, 5);

        kompis.add(k1);
        kompis.add(k2);
        kompis.add(k3);
        kompis.add(k4);
        kompis.add(k5);

        return kompis;
    }
}