package exercicio03


data class Programador(
    var idProgramador: Int,
    var nomeProgramador: String,
    var cpfProgramador: String,
    var salarioProgramador: Double){



    fun atualizarSalarioProgramador(): Double {
    return (salarioProgramador + (salarioProgramador * 0.2))
}}