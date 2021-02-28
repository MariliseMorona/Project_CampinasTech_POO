package exercicio01

// Crie um programa em Kotlin que representa uma pessoa
// Essa pessoa terá atributos privados de nome, data de nascimento e altura
// Com isso, crie métodos públicos para acessar essas propriedades
// Bem como outros dois métodos para:
// *Exibir todos os dados da pessoa em uma String só, por exemplo:
// "Ana nasceu em 04 de Janeiro, tem 38 anos e possui 1,72m de altura".
// *Um método para calcular a idade da pessoa
// Para esse exercicio, não é necessário a interação do usuário
// É permitido instanciar os objetos diretamente na classe para teste

data class Pessoa(
    private var nome: String,
    private var diaNascimento: String,
    private var mesNascimento: String,
    private var anoNascimento: Int,
    private var altura: String){

    fun calcularIdade(): Int {
        return (2021 - anoNascimento)
    }
    fun getInfo() : String{
    return "A $nome tem ${calcularIdade()}, nasceu em $diaNascimento de $mesNascimento e tem $altura de altura."
}
}

