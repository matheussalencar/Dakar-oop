public class SocorristaMoto extends Moto implements Socorro {

    public SocorristaMoto(float velocidade, float acelaracao, float anguloGiro, String placa) {
        super(velocidade, acelaracao, anguloGiro, placa);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void socorrer(Veiculo veiculo) {
       System.out.println("Socorrendo moto: " + veiculo.getPlaca());
        
    }
    
}
