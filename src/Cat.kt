class Cat(food: String?, location: String?) : Animal(food!!, location!!) {
    var color: String? = null

    override fun eat() {
        println("The cat is eating")
    }

    override fun makeNoise(): String {
        return "Meow-Meow"
    }

    override fun toString(): String {
        return "Dog{" + "food='" + food + '\'' + ", location='" + location + '\'' + '}'
    }
}