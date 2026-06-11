
enum class Country(val code: String) {
    GERMANY("DE"), FRANCE("FR"), USA("US")
}
fun greetMe(country: Country): String {
    return when(country) {
        Country.GERMANY -> "Guten Tag!"
        Country.FRANCE -> "Bonjour!"
        Country.USA -> "Hello!"
    }
}

fun main() {
    println(greetMe(Country.USA))
    for(country in Country.entries) {
        println(country)
    }
}