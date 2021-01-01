# Padrão de projecto DAO (Data Access Object)

Ideia geral do padrão DAO:

● Para cada entidade, haverá um objeto <strong> responsável por fazer acesso a dados relacionado a esta
entidade.</strong> Por exemplo:
<p>  o Cliente: ClienteDao </p><br>
<p>  o Produto: ProdutoDao </p><br>
<p>  o Pedido: PedidoDao </p>  <br>
  
● Cada DAO será definido por uma interface. <br>
● A injeção de dependência pode ser feita usando o padrão de projecto Factory <br>





