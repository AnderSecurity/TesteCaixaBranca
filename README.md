# 1) Extração dos Dados - Grafo

![grafo](https://github.com/AnderSecurity/TesteCaixaBranca/assets/114704633/a340de17-fa80-4191-9dea-766a849b14ac)

# 2) Grafo de Fluxo

![fluxo](https://github.com/AnderSecurity/TesteCaixaBranca/assets/114704633/cc6cc003-55b1-4874-a39e-b67ba8a7e5b0)

# 3) Complexidade Clclomática

A fórmula é dada por "qtd. de caminhos = arestas - nós + 2". Logo, temos 15 arestas e 14 nós, totalizando 1+2 = 3 caminhos.

# 4) Caminhos

Temos 3 caminhos:

A) 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 13 - 14: Um Exception caso não haja conexão com o banco de dados;
B) 1 - 2 - 3 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 13 - 14: Houve conexão com o banco de dados e o resultado foi encontrado;
C) 1 - 2 - 3 - 5 - 6 - 7 - 8 - 9 - 10 - 12 - 13 - 14: Exception caso o usuário não fosse encontrado.
