fun main() {


}

fun isValidIPv4(input: String):Boolean{

    if (input.contains(" ")) return false

    val segments = input.split('.')

    if (segments.size != 4) return false

    for (segment in segments){
        if (segment.isEmpty() || !segment.all { it.isDigit() }) return false
        if (segment.length>1 && segment.startsWith('0')) return false
        val convertedSegment = segment.toIntOrNull() ?: return false
        if (convertedSegment !in 0 .. 255) return false

    }

    return true
}
