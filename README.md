# 🏦 Sistema Bancário Simples em Java

Este é um projeto simples de **Sistema Bancário** desenvolvido em **Java** 

O objetivo deste projeto é demonstrar a aplicação de conceitos fundamentais de **Programação Orientada a Objetos (POO)** e a criação de uma interface em modo texto (CLI) interativa para manipulação de conta bancária.

---

## 🚀 Funcionalidades

- **📥 Depósito:** Permite adicionar fundos à conta.
- **📤 Saque:** Permite retirar valores da conta, validando se há saldo suficiente.
- **💰 Consulta de Saldo:** Exibe o saldo atual da conta.
- **🔄 Menu Interativo:** Execução contínua via terminal até que o usuário escolha encerrar.
- **📄 Encapsulamento de Dados:** Gerenciamento de informações da conta (`titular`, `saldo` e `limite`) através do objeto `ContaBancaria`.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 21+)
- **IDE:** IntelliJ IDEA

---

## 📂 Estrutura do Código

O projeto é composto por duas partes principais:

1. **`ContaBancaria.java`**:
   - Atributos privados: `titular`, `saldo`, `limite`.
   - Métodos operacionais: `sacar()`, `depositar()`, `getSaldo()`, `pagarFatura()`, `transferir()` e `toString()`.

2. **`Main.java`**:
   - Ponto de entrada do sistema.
   - Gerencia o fluxo da aplicação utilizando a estrutura `switch-case` dentro de um laço `do-while`.

