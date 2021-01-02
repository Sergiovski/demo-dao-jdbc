# Padrão de projecto DAO (Data Access Object)

Ideia geral do padrão DAO:

● Para cada entidade, haverá um objecto <strong> responsável por fazer acesso a dados relacionado a esta
entidade.</strong> &nbsp; Por exemplo: <br>
&emsp;  o Cliente: ClienteDao <br>
&emsp;  o Produto: ProdutoDao <br>
&emsp;  o Pedido: PedidoDao <br>
  
● Cada DAO será definido por uma interface. <br>
● A injeção de dependência pode ser feita usando o padrão de projecto Factory <br>

![UML Padrão de Projecto Factory](https://i.ibb.co/XXJwkVW/UMLReadme.png)





