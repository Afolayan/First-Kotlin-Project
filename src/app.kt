import java.util.*

fun main(args: Array<String>) {
    println("Hello World")
    feedTheFish()

    var bubble = 0
    while (bubble < 50){
        bubble++
    }

    repeat(2, {
        println("A fish is swimming")
    })
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eats $food")
    if(shouldChangeWater(day)){
        println("Change the water today")
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20
        ): Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun swim(speed: String = "fast"){
    println("swimming $speed")
}

fun randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String):String {
    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> {
            return "fasting"
        }
    }
}