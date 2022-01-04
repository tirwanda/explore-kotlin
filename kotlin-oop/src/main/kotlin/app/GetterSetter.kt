package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("My Courses")
    println(note.title)

    val bigNote = BigNote("My Big Note")
    println(bigNote.bigTitle)
}