package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        double difference = o1.getCost() - o2.getCost();

        if (difference == 0) {
            return 0;
        } else if (difference < 0){
            return -1;
    } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "ConeComparator{}";
    }
}
