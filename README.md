# Lista de Tarefas em Java

Este é um projeto simples de lista de tarefas desenvolvido em Java que permite ao usuário adicionar, visualizar, marcar como concluídas, remover e encerrar a lista de tarefas através de uma interface de linha de comando.

## Funcionalidades

1. **Adicionar Tarefa**: Permite ao usuário adicionar uma nova tarefa à lista.
2. **Ver Lista**: Exibe todas as tarefas adicionadas à lista.
3. **Marcar Tarefa como Concluída**: O usuário pode marcar uma tarefa como concluída. A tarefa será atualizada com o status "(Concluída)".
4. **Remover Tarefa**: Remove uma tarefa específica da lista.
5. **Encerrar**: Sai do programa.

## Estrutura do Código

O código usa uma estrutura de repetição `while` que mantém o programa rodando até que o usuário selecione a opção de encerrar. Ele utiliza um `ArrayList<String>` para armazenar as tarefas, e o `Scanner` para capturar as entradas do usuário.

### Controle de Fluxo

1. **Entrada do Usuário**: O programa solicita ao usuário que selecione uma opção no menu, onde cada número representa uma ação específica.
   
2. **Validação de Erros**: São tratadas exceções como `InputMismatchException` para capturar entradas inválidas (quando o usuário insere algo que não é um número).

3. **Switch Case**: O código principal utiliza um `switch case` que executa diferentes funções dependendo da escolha do usuário:
   - **Opção 1**: Adiciona uma nova tarefa, verificando se a entrada não está vazia.
   - **Opção 2**: Exibe a lista completa de tarefas, ou uma mensagem se a lista estiver vazia.
   - **Opção 3**: Permite marcar uma tarefa como concluída, atualizando o status da tarefa.
   - **Opção 4**: Remove uma tarefa selecionada pelo usuário.
   - **Opção 5**: Encerra o programa.

### Tratamento de Exceções

O código utiliza blocos `try-catch` para capturar entradas inválidas. Por exemplo, ao tentar inserir um número para escolher uma tarefa, o programa captura entradas que não sejam números, evitando que o programa quebre.

## Como Rodar o Projeto

1. Clone o repositório ou copie o código para sua máquina.
2. Compile o código Java utilizando o compilador de sua preferência (por exemplo, `javac`).
3. Execute o programa via linha de comando.

### Exemplo de execução:

```bash
javac ListaDeTarefas.java
java ListaDeTarefas
```

### Menu Interativo

Quando o programa for executado, ele apresentará o seguinte menu:

```
||Lista De Tarefas||
[1] Adicionar Tarefa
[2] Ver Lista
[3] Marcar Concluído
[4] Remover item
[5] ENCERRAR
Digite um comando:
```

O usuário pode escolher a opção desejada digitando o número correspondente.

## Requisitos

- Java 8 ou superior
- Um ambiente de desenvolvimento ou compilador para rodar o código (como IntelliJ, Eclipse, ou terminal com o JDK instalado)

## Contribuições

Se você deseja contribuir para melhorar o projeto, fique à vontade para fazer um fork e submeter pull requests.

---

Esse README fornece uma visão geral completa do funcionamento do código, instruções de uso, e a motivação por trás de cada funcionalidade.
