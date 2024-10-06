package com.davidmaiques.pokemon

class PokemonAigua(
    nom: String,
    atac: Float,
    salut: Float = 100f,
    velocitat: Int,
    private var resistenciaAigua: Int = 500,
    private var tempsSumergit: Int = 0,
) :
    Pokemon(nom, atac, salut, velocitat) {

    fun getResistenciaAigua() = this.resistenciaAigua
    fun getTempsSumergit() = this.tempsSumergit

    fun respirar() {
        this.tempsSumergit++
    }

    fun inmresio() {
        this.resistenciaAigua--
    }

    override fun toString(): String {
        return "${super.toString()} PokemonAigua(resistenciaAigua=$resistenciaAigua, tempsSumergit=$tempsSumergit)"
    }

    fun setResistenciaAigua(i: Int) {
        this.resistenciaAigua=i
    }

    fun setTiempoSumergido(i: Int) {
        this.tempsSumergit=i
    }

    override fun atacar() {
        super.atacar()
        println("agua !!!!")
    }

}