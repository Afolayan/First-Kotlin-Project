package aquarium

fun main(args: Array<String>){
    buildAquarium()
    makeFish()
}

private fun buildAquarium() {
    val myAquarium = Aquarium()
    println("length: ${myAquarium.length}")
    println("width: ${myAquarium.width}")
    println("height: ${myAquarium.height}")

    val thisAquarium = Aquarium(20)
    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium; ${smallAquarium.volume} liters")
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println(message = "Shark: ${shark.color} \nPlecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()
}
