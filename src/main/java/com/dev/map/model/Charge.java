package com.dev.map.model;

import java.util.List;
import java.util.Objects;

public class Charge {
    private int id;
    private String name;
    private List<Modifier> modifiers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<Modifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", modifiers=" + modifiers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Charge charge = (Charge) o;
        return id == charge.id && Objects.equals(name, charge.name) && Objects.equals(modifiers, charge.modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, modifiers);
    }
}
