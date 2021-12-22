public class SocorristaCarro extends Carro implements Socorro{

    public SocorristaCarro(float velocidade, float aceleracao, float anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void socorrer(Veiculo veiculo) {
     System.out.println("Socorrendo Carro: " + veiculo.getPlaca());
        
    }
    
    

}
