
# 💻Projeto: Cadastro de Pessoas e Cargos em Java

Este é um projeto simples desenvolvido em Java para cadastrar pessoas e atribuir cargos a elas. O objetivo principal é praticar conceitos de programação orientada a objetos e manipulação de dados em Java, como listas e classes inter-relacionadas.

Este projeto está dividido em fases de implantação.

| Fase | Descrição | Detalhamento |
| --- | --- | --- |
| 1 | Desenvolvimento da lógica e implementação do código. | Desenvolvimento de toda parte lógica necessária para transformação em código JAVA, definição dos métodos, classes e atributos. |
| 2 | Implementação do banco de dados (MongoDB ou MySQL a definir). | Definição da escolha de qual banco de dados utilizar, criação do modelo relacional, definição dos elementos e atributos que serão utilizados no desenvolvimento do banco de dados. |
| 3 | Implementação de interface gráfica utilizando JavaFX. | Definição das telas, definição e implementação da lógica a ser utilizada, definição da identidade visual da interface com o usuário. |

<br>

## ⚙️Funcionalidades

- **Cadastro de Pessoas**:
  - Nome
  - Idade
  - CPF
  - Sexo
  - Cargo (associado à pessoa)
  
- **Cadastro de Cargos**:
  - Função
  - Departamento
  - Status (Ativo/Inativo)
  
- **Associação entre Pessoas e Cargos**:
  - Cada pessoa tem um cargo atribuído.

- **Métodos de Cadastro e Exibição**:
  - Métodos para cadastro e visualização de pessoas e cargos.


## 🛠️Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para o desenvolvimento da aplicação.
- **Scanner**: Para a entrada de dados pelo usuário.
- **ArrayList**: Para armazenar os dados de pessoas e cargos em listas dinâmicas.


## ⏯️Como Rodar o Projeto

1. Clone o repositório para a sua máquina local:
   ```bash
   git clone https://github.com/dievit/pessoas-e-cargos-java.git

2. Abra o projeto na sua IDE preferida, como IntelliJ IDEA.

3. Compile e execute a classe Main.java para rodar a aplicação.

4. Siga as instruções que aparecerão no console para cadastrar pessoas e cargos.

## ⭐Exemplo de Uso
Ao rodar o programa, o sistema solicitará informações sobre a pessoa, como nome, idade, CPF, sexo e cargo. Exemplo:

```bash
Digite o nome da pessoa:
John Doe
Digite a idade da pessoa:
30
Digite o CPF da pessoa:
123.456.789-00
Digite o sexo da pessoa:
M
Digite o cargo da pessoa:
Gerente de TI


Após inserir as informações, o programa exibirá o cadastro realizado.
