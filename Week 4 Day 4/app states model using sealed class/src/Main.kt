// Week 4, Day 4 - app states model using sealed class
sealed class UIState {
    object Idle : UIState()
    object Loading : UIState()
    data class Success(val users: List<String>): UIState()
    data class Error(val message: String): UIState()
}

fun renderUI(state: UIState) {
    println(when (state) {
        is UIState.Idle -> "nothing has happened yet"
        is UIState.Loading -> "request in progress"
        is UIState.Success -> "Got a list of users:\n${state.users.joinToString("\n")}"
        is UIState.Error -> state.message
    } + "\n")
}

fun main() {
    val state1 = UIState.Idle
    val state2 = UIState.Loading
    val state3 = UIState.Success(listOf("Krishna", "Mano", "Chaitanya"))
    val state4 = UIState.Error("Something went wrong")
    renderUI(state1)
    renderUI(state2)
    renderUI(state3)
    renderUI(state4)
}