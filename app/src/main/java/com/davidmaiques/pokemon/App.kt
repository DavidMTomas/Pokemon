package com.davidmaiques.pokemon

fun main() {

    val milotic= Pokemon("Milotic", 60f,90f,81)
    println(milotic)

    val golem= Pokemon("Golem", 120f, velocitat = 45)
    println(golem)

    val flygon= Pokemon("Flyugon", 100f,40f,100)
    println(flygon)

    flygon.setSalut(80f)
    println(flygon.getSalut())
    flygon.atacar()

    val greninja=PokemonAigua("Greninja",95f,89f,122,20,10)
    println(greninja)

    greninja.inmresio()
    println( greninja.getResistenciaAigua())

    val vaporeon = PokemonAigua("Vaporeon",65f,73f,65,42,15)
    println(vaporeon)

    greninja.setResistenciaAigua(20)
    greninja.setTiempoSumergido(10)
    greninja.atacar()
    println(greninja)

    val darmanitan=PokemonFoc("darmanitan",140f,100f,95,200)

    println(darmanitan)
    darmanitan.setTemperaturaFoc(200)
    println(darmanitan.getTemperaturaFoc())
    darmanitan.atacar()
    darmanitan.entrenar()






}