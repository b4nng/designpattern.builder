package com.company;

public class ComputadorBuilder {
    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public Computador build(){
        if(computador.getNomeIdentificador().equals("")){
            throw new IllegalArgumentException("Nome Vazio ou Inválido");
        }
        return computador;
    }

    public ComputadorBuilder setNomeIdentificador(String nomeIdentificador){
        computador.setNomeIdentificador(nomeIdentificador);
        return this;
    }
    public ComputadorBuilder setProcessador(String processador){
        computador.setProcessador(processador);
        return this;
    }
    public ComputadorBuilder setMemoriaRAM(String memoriaRAM){
        computador.setMemoriaRAM(memoriaRAM);
        return this;
    }
    public ComputadorBuilder setArmazenamento(String armazenamento){
        computador.setArmazenamento(armazenamento);
        return this;
    }
    public ComputadorBuilder setFonte(String fonte){
        computador.setFonte(fonte);
        return this;
    }
    public ComputadorBuilder setPlacaVideo(String placaVideo){
        computador.setPlacaVideo(placaVideo);
        return this;
    }
    public ComputadorBuilder setPlacaMae(String placaMae){
        computador.setPlacaMae(placaMae);
        return this;
    }
    public ComputadorBuilder setGabinete(String gabinete){
        computador.setGabinete(gabinete);
        return this;
    }
    public ComputadorBuilder setCooler(String cooler){
        computador.setCooler(cooler);
        return this;
    }
}

