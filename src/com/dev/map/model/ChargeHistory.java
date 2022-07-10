package com.dev.map.model;

import java.util.List;
import java.util.Objects;

public class ChargeHistory {
    private String historyClaimId;
    private List<Charge> charges;

    public String getHistoryClaimId() {
        return historyClaimId;
    }

    public void setHistoryClaimId(String historyClaimId) {
        this.historyClaimId = historyClaimId;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "ChargeHistory{" +
                "historyClaimId='" + historyClaimId + '\'' +
                ", charges=" + charges +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChargeHistory history = (ChargeHistory) o;
        return Objects.equals(historyClaimId, history.historyClaimId) && Objects.equals(charges, history.charges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historyClaimId, charges);
    }
}
