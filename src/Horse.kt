import java.io.Serializable

class Horse(food: String?, location: String?) : Animal(food!!, location!!), Serializable {
    var weight = 0.0

    override fun eat() {
        println("The horse is eating")
    }

    override fun makeNoise(): String {
        return "Yoke"
    }

    override fun toString(): String {
        return "Horse{" + "food='" + food + '\'' + ", location='" + location + '\'' + '}'
    }
}