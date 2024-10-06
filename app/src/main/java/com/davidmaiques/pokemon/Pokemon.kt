package com.davidmaiques.pokemon

open class Pokemon(
    protected var nom: String,
    protected var atac: Float,
    private var  salut: Float = 100f,
    protected var velocitat: Int,
):Acciones {

    constructor(nombre: String) : this(nombre, 0f, 100f, 0) {}
    constructor(nom: String, atac: Float) : this(nom, atac, 100f, 0) {}


   fun setSalut(salut: Float) {
        this.salut = salut;
}


   fun getSalut() = this.salut


    override fun toString(): String {
        return "Pokemon(nom='$nom', atac=$atac, salut=$salut, velocitat=$velocitat)"
    }


   open fun atacar(){
        println("Atacando...")
    }


}