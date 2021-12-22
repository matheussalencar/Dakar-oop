

public class Veiculo {
    private float velocidade;
    private float acelaracao;
    private float anguloGiro;
    private String placa;
    private float peso;
    private Integer rodas;

    
    public Veiculo(float velocidade, float acelaracao, float anguloGiro, String placa, float peso, Integer rodas) {
        this.velocidade = velocidade;
        this.acelaracao = acelaracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Carro: " + this.getPlaca() + " Velocidade " + this.getVelocidade();
    }

    public float getVelocidade() {
        return velocidade;
    }
    public float getRodas() {
        return rodas;
    }
    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getPlaca() {
        return placa;
    }

    public float getAcelaracao() {
        return acelaracao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public float getAnguloGiro() {
        return anguloGiro;
    }
    public void setAnguloGiro(float anguloGiro) {
        this.anguloGiro = anguloGiro;
    }


    public void setAcelaracao(float acelaracao) {
        this.acelaracao = acelaracao;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }


}
