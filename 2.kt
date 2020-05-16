fun main(args: Array<String>) {
    cek_kata("2 pasang sandal hilang")
}

fun cek_kata(kata : String){
    val lstValues: List<String> = kata.split(" ").map { it -> it.trim() }
    var total = 0
    var countWords = 0
    lstValues.forEach { it ->
                   total++
                   if(isLetters(it)){
                       countWords++
                   }
               }
    println("$countWords / $total")           
}

fun isLetters(string: String): Boolean {
	return string.matches("^[a-zA-Z]*$".toRegex())
}