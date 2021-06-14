package com.company;

public class Main {

    public static void main(String[] args) {
        ComputadorBuilder pcbuilder = new ComputadorBuilder();
        Computador pc = pcbuilder.setNomeIdentificador("PC dos Deuses")
                .setArmazenamento("500 gb")
                .setCooler("water cooler corsair h1150")
                .setFonte("500W")
                .setGabinete("NZXT 80")
                .setMemoriaRAM("32gb")
                .setPlacaMae("Z97m-plus")
                .setPlacaVideo("rtx 2080ti")
                .setProcessador("i9 10990K")
                .build();
    }
}
