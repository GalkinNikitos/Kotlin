class Dog(food: String?, location: String?) : Animal(food!!, location!!) {

    var name: String? = null

    override fun eat() {
        println("The dog is eating")
    }

    override fun makeNoise(): String {
        return "Gav-Gav"
    }

    override fun toString(): String {
        return "Dog{" + "food='" + food + '\'' + ", location='" + location + '\'' + '}'
    }
}