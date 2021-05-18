package Telephone.logic;

import Telephone.model.Telephone;

public class Charger {
    public void charge(Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
