package aquarium

abstract class AquariumFish{
    abstract val color: String
}

class Shark: AquariumFish(), FishAction{
    override fun eat() {
        println("hunt and eat fish")
    }

    override val color: String
        get() = "gray"
}

class Plecostomus: AquariumFish(), FishAction{
    override fun eat() {
        println("munch on algae")
    }

    override val color: String
        get() = "gold"
}

interface FishAction {
    fun eat()
}