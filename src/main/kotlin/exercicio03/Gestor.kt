
package exercicio03


data class Gestor(
        var idGestor: Int,
        var nomeGestor: String,
        var cpfGestor: String,
        var salarioGestor: Double) {




    fun atualizarSalarioGestor(): Double {
        return (salarioGestor+(salarioGestor * 0.2))
    }}
