Descrição:
Este programa em Java é uma aplicação de console que permite o registro de trabalhadores e seus respectivos contratos de trabalho. A aplicação permite calcular a renda de um trabalhador para um mês e ano específicos, considerando seu salário base e os valores dos contratos realizados naquele período.

Funcionalidades:
1 - Registrar novo trabalhador: Adiciona um novo trabalhador com nome, nível, salário base e departamento.
2 - Registrar novo contrato: Adiciona contratos de trabalho para um trabalhador específico. 
3 - Calcular renda: Calcula a renda de um trabalhador para um determinado mês e ano.
4 - Listar todos os trabalhadores: Exibe todos os trabalhadores registrados.
5 - Finalizar sistema: Encerra a aplicação.


Estrutura do Projeto
O projeto possui as seguintes classes principais:

Worker
Representa um trabalhador com nome, nível, salário base, departamento e uma lista de contratos.

HourContract
Representa um contrato de trabalho com data, valor por hora e duração em horas.

Department
Representa um departamento com nome.

WorkerLevel
Enumeração para os níveis de um trabalhador (JUNIOR, MID_LEVEL, SENIOR).

Program
Classe principal que contém a lógica do menu e as operações possíveis.

