fun main(args: Array<String>) {
    duplicateString("hari apa saja saya bisa!")
}

fun duplicateString(kata:String) {
  var map = HashMap<Char, Int>()
  var str = kata.replace(("\\s").toRegex(), "")
  var chars = str.toCharArray()
  for (ch in chars)
  {
    if (map.containsKey(ch))
    {
      map.put(ch, map.get(ch) + 1)
    }
    else
    {
      map.put(ch, 1)
    }
  }
  var keys = map.keySet()
  for (ch in keys)
  {
    if (map.get(ch) > 1)
    {
      println("Char " + ch + " " + map.get(ch))
    }
  }
}