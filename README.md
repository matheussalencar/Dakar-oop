## DAKAR

Implementação do exercicio DAKAR de oop do bootcamp meli/dh

### Grupo 11

- [Stéphanie da Silva Leal](https://github.com/stephleal)
- [Lucas Garcia Macchione Prudente Correa](https://github.com/LucasGarcia97)
- [Mauro Bergonzoni Junqueira](https://github.com/mbjunqueiraweb)
- [Iberê Abondanza Kuhlmann](https://github.com/ikuhlmann-meli)
- [Matheus Santos Alencar](https://github.com/matheussalencar)

## Descrição do projeto

#### 1. Crie a classe do Veiculo que possui os seguintes atributos:
- velocidade
- aceleracao
- anguloDeGiro
- placa
- peso
- rodas
#### 2. Modele a classe Corrida que possui os seguintes atributos:
- distancia
- premioEmDolares
- nome
- quantidadeVeiculosPermitidos
- listaVeiculos
#### 3. Adicionar duas novas categorias de veículos:
- Carros
- Motos
Os carros pesam 1.000 quilos e as motocicletas 300 quilos, os carros têm 4 rodas e as
motocicletas 2.
#### 4. Uma corrida também tem um conjunto de veículos que participarão dela. Portanto,
agora a corrida terá a responsabilidade de poder adicionar um veículo à corrida,
portanto devemos definir os seguintes métodos:
public void registrarCarro(velocidade, aceleracao, anguloDeGiro, patente);
public void registrarMoto(velocidade, aceleracao, anguloDeGiro, patente);
Ambos os métodos adicionam um veículo, desde que haja espaço.
#### 5. Teremos também a possibilidade de eliminar um veículo usando dois métodos:
public void removerVeiculoo(veiculo);
public void removerVeiculoPorPlaca(String placa);
#### 6. Queremos ser capazes de definir o vencedor de uma corrida:
O vencedor será aquele com o valor máximo determinado pela seguinte fórmula:
velocidade * aceleracao / ( anguloDeGiro * (peso - quantidadeDeRodas * 100)
#### 7. As corridas também contam com veículos salva-vidas que, em caso de emergência, vão
consertar um veículo. Como os carros são muito diferentes das motocicletas, existem duas
classes diferentes de veículos salva-vidas. Um deles só sabe ajudar carros e outro só sabe
ajudar motocicletas.
- Adicione as classes
SocorristaCarro
SocorristaMoto
- Adicione os métodos:
SocorristaCarro → public void socorrer(Carro carro)
SocorristaMoto → public void socorrer(Moto moto)
Quando um salva-vidas se aproxima de um carro, ele imprime “Socorrendo carro” e o
número da patente na tela, quando ajuda uma motocicleta, ele imprime “Socorrendo moto”
e o número da patente na tela.
- Adicione um salva-vidas de carro e um de moto à classe de corrida:
- Adicione a responsabilidade de ajudar uma motocicleta e um carro:
public void socorrerCarro(String documento);
public void socorrerMoto(String documento);

