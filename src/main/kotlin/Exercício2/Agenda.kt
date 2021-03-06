package Exercício2

class Agenda(var nome: String = "", var tel: String = "") {
    var agenda = mutableListOf<Contato>()

    fun salvarContato(): String {
        if (agenda.size <= 9) {
            var buscar = agenda.filter { it.contatoNome == nome && it.contatoTelefone == tel }
            if (buscar.isEmpty()) {
                var contato = Contato(nome, tel)
                agenda.add(contato)
                return "Contato ${nome} foi salvo com sucesso!"
            } else {
                return "Contato já existente. Nome: ${nome}, telefone: ${tel}!"
            }
        } else {
            return "Agenda está com sua capacidade máxima."
        }
    }
    fun getContatos() {
        if (agenda.isNotEmpty()) {
          agenda.forEach{ println("Nome: ${it.contatoNome }, telefone: ${it.contatoTelefone}")}
        } else println("Agenda está vazia!")
    }

    fun deletarContato(): String {
        var localizar = agenda.filter { it.contatoNome == this.nome && it.contatoTelefone == tel }
        var mensagem = ""

        if (localizar.isNotEmpty()) {
            agenda.remove(element = localizar[0])
            mensagem = "Contato ${nome} foi removido com sucesso!"
        } else {
            mensagem = "Contato ${nome} não foi localizado!"
        }
        return mensagem
    }

    fun getContato(){
        var buscaContatoCad = agenda.filter { it.contatoNome == this.nome }
        if (buscaContatoCad.isNotEmpty()) {
            buscaContatoCad.forEach{println("Nome: ${it.contatoNome}, tel: ${it.contatoTelefone}")}
        } else { println("Contato ${nome} não foi localizado!")
        }
    }
}

// falta fazer a validação do telefone, tranformar tel para inteiro em contato e melhorar a validação do nome



