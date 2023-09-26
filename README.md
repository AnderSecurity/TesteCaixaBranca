# Teste da Caixa Branca

O código do repositório possui alguns problemas a serem resolvidos:

# 1) Organização do código
A organização deveria ser melhorada para uma melhor estética, como por exemplo:
a) Criar as variáveis no começo da classe (linhas 17 e 18), como é feito por padrão;
b) Os dois "Catch's" deveriam retornar uma mensagem de erro ao usuário, a fim de orientar o motivo do erro, nas linhas 15 e 32;
c) A chave que fecha o catch (linha 16) deveria estar na linha de baixo, para mostrar o encerramento do catch com mais facilidade. Além disso, o "return conn;" deveria estar com um espaçamento TAB para mostrar que está dentro do catch.

# 2) Vulnerabilidade
A utilização de strings por via da lista na conexão com o SQL deixa-o com vulnerabilidade SQL injection, utilizados nas linhas 23, 24 e 25.

# 3) Try-Catch-Finally
Na utilização do Try Catch, deve-se usar o Finally para encerrar as conexões com o SQL, visto que nenhuma foi encerrada devidamente no código (linhas 15 e 32).

# 4) Comentários no Código
Deve-se utilizar mais comentários no código, para que se outros desenvolvedores precisem realizar a manutenção no código.
