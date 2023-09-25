fun main() {
    val timeOfLeavingHour = 9
    val timeOfLeavingMinute = 45

    val timeInRoadHour = 8
    val timeInRoadMinute = 1

    val arrivalHour = timeOfLeavingHour + timeInRoadHour
    val arrivalMinute = timeOfLeavingMinute + timeInRoadMinute
    val notes = ":"

 println("$arrivalHour$notes$arrivalMinute")

}


