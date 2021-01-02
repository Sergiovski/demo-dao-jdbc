# Padrão de projecto DAO (Data Access Object)

Ideia geral do padrão DAO:

● Para cada entidade, haverá um objeto <strong> responsável por fazer acesso a dados relacionado a esta
entidade.</strong> Por exemplo: <br>
&emsp;  o Cliente: ClienteDao <br>
&emsp;  o Produto: ProdutoDao <br>
&emsp;  o Pedido: PedidoDao <br>
  
● Cada DAO será definido por uma interface. <br>
● A injeção de dependência pode ser feita usando o padrão de projecto Factory <br>





