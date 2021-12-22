
public class Carro extends Veiculo {

    public Carro(float velocidade, float aceleracao, float anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, 1000, 4);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
