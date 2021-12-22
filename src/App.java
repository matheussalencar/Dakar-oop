import java.math.BigDecimal;


public class App {
    public static void main(String[] args) throws Exception {

        Carro c1 = new Carro(200.f, 80.0f, 50.0f, "AABC2342");
        Moto m1 = new Moto(100F, 40.0f, 30.f, "JJDN2423");

        SocorristaCarro carroSocorro1 = new SocorristaCarro(100.f, 80.f, 100, "USA29922");
        SocorristaMoto motoSocorro1 = new SocorristaMoto(280f, 90f, 50, "ES39920");

        Corrida corrida1 = new Corrida(120.0f, new BigDecimal(1500.0), "Paris Dakar", 2);

        corrida1.registrarCarro(120.0f, 80.0f, 50.0f, "AAHV45");
        corrida1.registrarCarro(200.0f, 100.0f, 10.0f, "DDJV897");
        corrida1.registrarCarro(50.0f, 20.0f, 80.0f, "BRA124SA");
        corrida1.registrarMoto(40.0f, 15.0f, 40.0f, "OK23232");




        System.out.println(corrida1.getListaVeiculos());

        //Veiculo vencedor = corrida1.vencedor();

        //System.out.println(vencedor);

        corrida1.removerVeiculo(corrida1.getListaVeiculos().get(2));

        System.out.println(corrida1.getListaVeiculos());

        carroSocorro1.socorrer(corrida1.getListaVeiculos().get(0));
        motoSocorro1.socorrer(corrida1.getListaVeiculos().get(2));


    }
}
