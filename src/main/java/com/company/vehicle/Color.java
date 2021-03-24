package com.company.vehicle;

public enum Color {
    RED("czerwony"),
    GREEN("zielony"),
    BLUE("niebieski");

    private String carColorPl;

    Color(String carColor) {
        this.carColorPl = carColor;
    }

    public String getCarColorPl() {
        return carColorPl;
    }
}
