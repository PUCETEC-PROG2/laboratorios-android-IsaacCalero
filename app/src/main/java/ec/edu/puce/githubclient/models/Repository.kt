package ec.edu.puce.githubclient.models


data class Repository(
    val id: String,
    val name: String,
    val owner: GithubUser,  // Instanciamos
    val description: String?, // El signo de pregunta indica si es nulo o no, por si llega o no llega la información
    val language: String?
)
