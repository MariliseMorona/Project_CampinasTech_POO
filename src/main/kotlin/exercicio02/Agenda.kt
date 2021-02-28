package exercicio02



//Crie um programa em Kotlin que tenha função de ser uma agenda de contatos.
//Essa agenda pode armazenar somente 10 contatos e precisa realizar as seguintes operações:
// a. Salvar contato: ao inserir o nome e o telefone de uma pessoa e
// ela não constar na agenda, salva então seu contato na agenda;
//b. Remover contato: ao inserir o nome e o telefone de uma pessoa e ela constar na agenda,
// seu contato é removido. Caso ela não exista, informar ao usuário;
// c. Buscar contato: ao inserir um nome, retornar seus dados. Se tiver mais de um resultado,
// exemplo, dois contatos de nome Juliana salvos com telefones diferentes, exibir ambos;
// d. Mostrar agenda completa com todos os contatos salvos

data class Agenda(var listaContatos:MutableMap<String, String>){


    fun Inserir(nome: String, telefone: String) {
        do{
            println("Insira o nome")
            val respostaNome = readLine()?.toIntOrNull()

            respostaNome?.let{
            var nome = it
            }
            println("Insira o telefone")
            var telefone = readLine().toString()
                fun add(){
                println("Contato cadastrado")
                }
        } while ( respostaNome == null && telefone.isEmpty())
        println("Contato não cadastrado, tente novamente")
    }


    fun Remover() {
        do {
            println("Insira o nome")
            val respostaNome = readLine()?.toIntOrNull()

            respostaNome?.let {
                var nome = it
            }
            println("Insira o telefone")
            var respostaTelefone = readLine().toString()
            respostaTelefone?.let {
                var telefone = respostaTelefone
                fun remove() {
                    println("Contato já existente, não será cadastrado")
                }
            }
        } while (respostaNome != null && respostaTelefone.isEmpty())

            fun add(){
            println("Contato cadastrado")
            }
    }


    fun Buscar() {
        fun contains(nome: String) {

            do {
                println("Insira o nome")
                val respostaNome = readLine()?.toIntOrNull()
                val let = respostaNome?.let {
                    var nome = it
                    fun Iterable<String>.filter(nome: Any) {
                    }
                }
            } while (false)
            println("Contato inexistente")
        }
    }

    fun Mostrar() {
        return listaContatos
    }
}



