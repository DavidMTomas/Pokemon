package com.davidmaiques.pokemon

class PokemonFoc(nom: String, atac: Float, salut: Float = 100f, velocitat: Int,private var temperaturaFoc:Int=90) :
    Pokemon(nom, atac, salut, velocitat) {

        fun llançaFlames(){
            temperaturaFoc++
        }


    override fun toString(): String {
        return "${super.toString()} PokemonFoc(temperaturaFoc=$temperaturaFoc)"
    }

    fun setTemperaturaFoc(temp:Int){
        this.temperaturaFoc=temp
    }

    fun getTemperaturaFoc()=this.temperaturaFoc


    override fun atacar() {
        super.atacar()
        println("fuego!!!")
    }

}