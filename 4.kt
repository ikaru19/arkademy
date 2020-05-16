fun main(args: Array<String>) {
    val masukan : String = "hari apa saja saya bisa!"
    duplicateString(masukan)
    
}

fun duplicateString(kata:String) {

  var str = kata.replace(("\\s").toRegex(), "")
  var test = (str.groupingBy { it }.eachCount().filter { it.value > 1 })
  var kosong = ("1".groupingBy { it }.eachCount().filter { it.value > 1 })
  if(test.keys){
        print("kosong")
  }else{
      print(test)
  }
}
