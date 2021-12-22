

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private float distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private Integer quantidadeCarrosPermitidos;
    private List<Veiculo> listaVeiculos;


    
    public Corrida(float distancia, BigDecimal premioEmDolares, String nome, Integer quantidadeCarrosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeCarrosPermitidos = quantidadeCarrosPermitidos;
        this.listaVeiculos = new ArrayList<Veiculo>();
    }


    public float getDistancia() {
        return distancia;
    }
    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
    public Integer getQuantidadeCarrosPermitidos() {
        return quantidadeCarrosPermitidos;
    }
    public void setQuantidadeCarrosPermitidos(Integer quantidadeCarrosPermitidos) {
        this.quantidadeCarrosPermitidos = quantidadeCarrosPermitidos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getPremioEmDolares() {
        return premioEmDolares;
    }

    
    public void setPremioEmDolares(BigDecimal premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }


    public void registrarCarro(float velocidade, float aceleracao,float anguloGiro, String patente) {
        Carro c1 = new Carro(velocidade, aceleracao, anguloGiro, patente);
        this.listaVeiculos.add(c1);
    }



    public void registrarMoto(float velocidade, float aceleracao,float anguloGiro, String patente){
        listaVeiculos.add(new Moto(velocidade, aceleracao, anguloGiro, patente));
    }

    public void removerVeiculo(Veiculo veiculo){
        for (int i=0; i < listaVeiculos.size(); i++) {
            if (listaVeiculos.get(i).equals(veiculo)) {
                listaVeiculos.remove(i);
            }
        }
    }
    public void removerVeiculoPorPlaca(String placa){

        for (int i= 0; i < listaVeiculos.size(); i++) {
            if (listaVeiculos.get(i).getPlaca() == placa) {
                listaVeiculos.remove(i);
            }
        }

       //Object carro = listaVeiculos.stream().filter((veiculo -> veiculo.getPlaca() == placa));
    }

    public Veiculo vencedor() {
        float perfomanceMaior = 0;
        Veiculo veiculo = this.listaVeiculos.get(0);
        for (int i =0; i < listaVeiculos.size(); i++) {
            float perfomance = perfomance(this.listaVeiculos.get(i));
            if (perfomance > perfomanceMaior) {
                veiculo = this.getListaVeiculos().get(i);
            }
        }

        return veiculo;

    }

    

    public float perfomance(Veiculo veiculo) {
        return ((veiculo.getVelocidade() * veiculo.getAcelaracao())/veiculo.getAnguloGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
    }
}
