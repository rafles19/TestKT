package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

}
