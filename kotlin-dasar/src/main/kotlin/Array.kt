fun main() {
    val members: Array<String> = arrayOf("Edho", "Dwi", "Tirwanda")
    println(members)
    members[1] = "D."
    println(members)

    val teamMate: Array<String?> = arrayOfNulls(3)
    teamMate[0] = "Edho"
    println(teamMate[1])
}