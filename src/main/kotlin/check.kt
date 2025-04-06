fun main() {
    check(
        name = "When a given address is more than 4 segments it should return false",
        result = isValidIPv4("190.168.1.1.1"),
        correctResult = false
    )
    check(
        name = "When a given address is less than 4 segments it should return false",
        result = isValidIPv4("190.172.1"),
        correctResult = false
    )
    check(
        name = "When a given address is contain segment more than 255 it should return false",
        result = isValidIPv4("256.172.1.1"),
        correctResult = false
    )
    check(
        name = "When a given address is contain segment less than 0 it should return false",
        result = isValidIPv4("256.172.1.-1"),
        correctResult = false
    )
    check(
        name = "When a given address is contain a non-numeric segment it should return false",
        result = isValidIPv4("256.172.1.a"),
        correctResult = false
    )
    check(
        name = "When a given address is an empty it should return false",
        result = isValidIPv4(""),
        correctResult = false
    )
    check(
        name = "When a given address is an blank it should return false",
        result = isValidIPv4(" "),
        correctResult = false
    )
    check(
        name = "When a given address is contain a dots in all segments it should return false",
        result = isValidIPv4("..."),
        correctResult = false
    )
    check(
        name = "When a given address is contain a white space it should return false",
        result = isValidIPv4("192.168. 1.1"),
        correctResult = false
    )
    check(
        name = "When a given address is contain a leading dot it should return false",
        result = isValidIPv4(".192.168.1.1"),
        correctResult = false
    )
    check(
        name = "When a given address is contain a trailing dot it should return false",
        result = isValidIPv4("192.168.1.1."),
        correctResult = false
    )
    check(
        name = "When a given address is contain a special character it should return false",
        result = isValidIPv4("192.168.1/1"),
        correctResult = false
    )
    check(
        name = "When a given address is contain a leading zero it should return false",
        result = isValidIPv4("192.168.1.01"),
        correctResult = false
    )
    check(
        name = "When a given address is contain a zero in all segments it should return true",
        result = isValidIPv4("0.0.0.0"),
        correctResult = true
    )
    check(
        name = "When a given address is contain a 4 segments separated by dots where\n" +
                "Each segment number between 0 and 255 it should return true",
        result = isValidIPv4("192.168.1.1"),
        correctResult = true
    )
}

fun check(name: String, result: Boolean, correctResult: Boolean){
    if (result == correctResult) println("Success - $name")
    else println("Failed - $name")
}
