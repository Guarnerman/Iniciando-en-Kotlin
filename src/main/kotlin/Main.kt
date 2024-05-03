package org.example

const val PI = 3.141592
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre = "Diego"
    println(nombre)
    println(PI)

    val boolean = true
    val numeroLargo = 3L
    val double : Double = 2.7181
    val float = 1.1f

    val primerValor = 20
    val segundo = 10
    val tercerValor = primerValor - segundo
    println(tercerValor)

    val apellido = "Guarneros"
    val nombreCompleto = "Mi nombre es $nombre $apellido"
    println(nombreCompleto)
}