
Single Responsibility Principle

Objetivo do conceito Single Responsibility Principle, é que cada class tenha a sua única responsabilidade.
Na atividade no ProcessadorEncomendas possuía vários métodos em uma class, ferindo o conceito S do SOLID,
Então foi separado em várias class para cumprir o conceito, foi criada as class: Calculafrete, Gravadordearquivo, Leitordedados.
Na class Leitordedados foi criado dois método: idencomenda, peso.
Foi criado dois get para cada método.
No class calculafrete foi criado um método calcular, que calcula o valor do frete e return.
No método Gravadordearquivo o código em si não foi alterado.

Liskov Substitution Principle

  O conceito da substituição Liskov diz que ao implementar uma herança, o objeto filho
  deve poder executar todas as ações do objeto pai, sem nenhuma exceção. No exemplo 2 
  do LSOLID, a classe ContaPoupanca herdava da classe ContaBancaria, porém o método de 
  sacar não era disponível na classe ContaPoupanca, portanto sendo obrigado a gerar uma
  exceção. Para corrigir isso, foi então implementada a classe pai Conta, com as 
  características de depositar e o atributo saldo, e então as classes filhas ContaPoupanca 
  e ContaBancaria, com a ContaBancaria adicionando o método sacar, e a ContaPoupanca livre
  para implementar alguma ação nova sem restrição.

Interface Segregation Principle

  O conceito de segregação de interface implica que uma interface não pode executar ações 
  que o usuário não precisa no momento. É comum a aparição de interfaces “inchadas” por 
  conterem muitos métodos que não são compatíveis consigo mesmo, como no exemplo 2 do
  ISOLID, onde a interface veículo possuía muitas ações, porém devido à implicação de 
  um veículo só poder andar em um meio, ao implementar a interface na classe carro, 
  apesar uma das ações estava sendo usada. Para corrigir isso, basta utilizar do princípio
  e segregar a interface “inchada” em interfaces menores com propósitos mais claros
  e nichados, assim, para cada meio que um veículo pode passar, há uma interface que
  implmenta essa ação.
