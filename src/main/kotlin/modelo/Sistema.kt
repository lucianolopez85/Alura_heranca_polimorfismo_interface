package modelo

class Sistema {

    fun entra(admin: Autenticavel, senha: Int): Boolean {
        if (admin.autentica(senha)) {
            println("====== Bem vindo ao YouBank ======")
            return true
        } else {
            println("Falha na autenticação")
            return false
        }
    }
}