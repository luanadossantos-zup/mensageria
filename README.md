# Projeto Mensageria #
---
## Objetivo ##
O objetivo desse projeto é o teste e prática de três conceitos:
- Programação Orientada a Eventos
- Threads
- Concorrência

Assim, simulando eventos, o uso de threads e processos em paralelo.

## Estrutura do Projeto ##
Essa aplicação possui 5 pacotes para exemplificação de Programação Orientada a Eventos, Threads, Concorrência e um pacote possuindo os três conceitos juntos.

Pacotes:
- **poe:** exemplo simples de um listener para um evento de clique de botão;
- **threads:** duas threads que executam uma estrutura de repetição "for" e simulam uma pausa de 1 segundo.
- **concorrencia:** três threads que executam uma estrutura de repetição. Na aplicação há um método que é marcado como synchronized. Isso garante que apenas uma thread por vez possa executar esse método, evitando condições de corrida.
- **banco:** exemplifica de forma simples um sistema bancário fictício. O exemplo simula um sistema onde múltiplas transações (saques e depósitos) são processadas em paralelo, e eventos são disparados para notificar o cliente sobre o status das transações.
- **mensageria_com_spring:** usa padrão Observer, onde um componente (o produtor) publica eventos, e outros componentes (os consumidores) podem reagir a esses eventos sem que o produtor precise saber quem são os consumidores.

## Como executar cada exemplo no IntelliJ
1. **Clone o repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd <PASTA_DO_PROJETO>

2. **Abra o projeto no IntelliJ**: No IntelliJ, clique em File > Open e selecione a pasta do projeto.

3. **Execute o exemplo**: Localize a classe principal (normalmente Main) de cada pacote.
   Selecione-a e pressione SHIFT-F10 para executar a aplicação.
