
# 💰 Conversor de Moedas Java

---

## 🚀 Visão Geral do Projeto

Este é um **Conversor de Moedas** desenvolvido em Java, utilizando princípios de **Programação Orientada a Objetos (POO)** e consumindo uma **API externa** para obter taxas de câmbio em tempo real. O objetivo é proporcionar uma ferramenta simples e interativa, via console, para converter valores entre diferentes moedas.

O projeto foi construído como parte de um desafio de programação para iniciantes, focando em:
* Consumo de APIs REST.
* Manipulação de dados JSON.
* Estruturação de código com POO (classes, objetos, encapsulamento).
* Interação com o usuário via console.
* Gerenciamento de dependências externas (biblioteca JSON).

---

## ✨ Funcionalidades

O conversor oferece as seguintes opções de conversão:

* **Dólar (USD) para Euro (EUR)**
* **Euro (EUR) para Dólar (USD)**
* **Dólar (USD) para Real (BRL)**
* **Real (BRL) para Dólar (USD)**
* **Euro (EUR) para Real (BRL)**
* **Real (BRL) para Euro (EUR)**

As taxas de câmbio são obtidas dinamicamente da [ExchangeRate-API](https://www.exchangerate-api.com/), garantindo que as conversões usem dados atualizados.

---

## 🛠️ Tecnologias Utilizadas

* **Java 23+**
* **Biblioteca `org.json`**: Para parsear (interpretar) as respostas JSON da API.
* **ExchangeRate-API**: Serviço para obter as taxas de câmbio.

---

## ⚙️ Como Configurar e Rodar o Projeto

Siga os passos abaixo para ter o projeto funcionando em sua máquina:

### Pré-requisitos

* **Java Development Kit (JDK)** instalado (versão 11 ou superior recomendada).
* **Git** instalado.
* Uma **chave de API** gratuita da [ExchangeRate-API](https://www.exchangerate-api.com/). Você precisará se registrar para obtê-la.

### 1. Clonar o Repositório

Abra seu terminal ou prompt de comando e clone o projeto:

```bash
git clone [https://github.com/SEU_USUARIO/NOME_DO_SEU_REPOSITORIO.git](https://github.com/SEU_USUARIO/NOME_DO_SEU_REPOSITORIO.git)
cd NOME_DO_SEU_REPOSITORIO
