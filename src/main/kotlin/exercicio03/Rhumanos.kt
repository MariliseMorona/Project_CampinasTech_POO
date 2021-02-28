package exercicio03

import exercicio03.Gestor.*
import exercicio03.Programador.*


// Crie um programa em Kotlin que faça o papel de gestão de RH em uma empresa:
// nessa empresa, os principais funcionários são divididos nese momentos entre gestores e os programadores.
// Por essa empresa estar passando por uma época de reajuste salarial, para lidar
// com isso de forma automatizada, você adequará seu software para realizar essa função
// com isso seu software deve:
// a. Salvar os dados (como ID, nome, CPF e salário atual) de um funcionário e ao final perguntar
// se ele é gestor ou programador, e só assim, instanciar o objeto e retornar a mensagem
// "Funcionário salvo com sucesso"
// b. Ao pesquisar um funcionário pelo ID, é dad a opção de exibir todos os seus dados
// ou aumentar o seu salário
// c. Para gestores, o reajuste é de 10%, já para programadores de 20%.

sealed class Rhumanos(var id: Int, var nome: String, var cpf: String, var salario: Double) {


    class Gestor(
        idGestor: Int,
        nomeGestor: String,
        cpfGestor: String,
        salarioGestor: String
    ) : Rhumanos(id = idGestor, nome = nomeGestor, cpf = cpfGestor, salario = salarioGestor)

    class Programador(
        idProgramador: Int,
        nomeProgramador: String,
        cpfProgramador: String,
        salarioProgramador: Double) : Rhumanos( id = idProgramador, nome = nomeProgramador, cpf = cpfProgramador, salario = salarioProgramador)



    fun novoSalario(funcionario: Rhumanos) : String {
        return when (funcionario) {
            is Gestor -> "Salário do gestor $nome, de ID $id, cujo CPF é $cpf atualizado para R$ ${atualizarSalarioGestor()}."
            is Programador -> "Salário do programador $nome, de ID $id, cujo CPF é $cpf atualizado para R$ ${atualizarSalarioProgramador()}."

        }
    }}