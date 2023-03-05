abstract class Animal(food: String, location: String) {
    var food: String? = null
    var location: String? = null

    init {
        this.food = food
        this.location = location
    }
    abstract fun eat()
    abstract fun makeNoise(): String?
    fun sleep() {
        println("Такое-то животное спит.")
    }
}