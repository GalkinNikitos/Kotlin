fun main(args: Array<String>) {
    val veterinarian = Veterinarian()
    val animals = arrayOfNulls<Animal>(3)
    animals[0] = Dog("Bone", "Aviary")
    animals[1] = Cat("Sausage", "Carpet")
    animals[2] = Horse("Grass", "Farm")

    for (animal in animals) {
        veterinarian.treatAnimal(animal)
    }
}