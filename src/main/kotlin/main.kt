import exercicio03.Gestor
import exercicio03.Programador
import exercicio03.Rhumanos
import exercicio03.novoSalario


//import exercicio01.Pessoa
//import exercicio02.Agenda

// ------------------   Exercício 01   ------------------
/*fun main(){

    var pessoa = Pessoa("Marilise", "22", "Setembro", 1990, "1,50m")

    println(pessoa.getInfo())

}

*/
// ------------------   Exercício 02   ------------------

/*fun main(){

 var agendaMarilise = mutableMapOf<String, String>().also { MutableMap<String, String> = it }

    ("Bem vindo a sua agenda, insira um novo contato")
    if() agendaMarilise.Inserir()
    else if () agendaMarilise.Buscar()
    else if () agendaMarilise.Mostrar()
    else () agendaMarilise.Mostrar()

*/
// ------------------   Exercício 03   ------------------

fun main() {

   val gestor: Gestor( 12, "Carlos", "875875", 3300.00)

    println(gestor.novoSalario())

   val programador: Programador( 23, "Mara", "674674", 3800.00)

    println(programador.novoSalario())
}