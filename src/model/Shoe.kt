package model

class Shoe(name: String, description: String, sku: Int, var brand: String):
    Product(name, description, sku), ICrudActions {

    override fun create(): String {
        return "Create Shoe"
    }

    override fun read(): String {
        return "Read Shoe"
    }

    override fun update(): String {
        return "Update Shoe"
    }

    override fun delete(): String {
        return "Delete Shoe"
    }

    override fun toString(): String {
        return super.toString() + "SKU ID: $sku \nMarca: $brand \nBrand: $model \nSize: $size \nColor: $color"
    }
    init {
        println("SKU ID: $sku")
        println("Brand: $brand")
    }
    var size: Int = 34 // Minimo sea 34
    set(value) {
        if(value > 34)
            field = value
        else
            field = 34
    }
    var color: String = "white"
    var model: String = "Boots" //No se ponga tennis
    set(value) {
        if(value.toLowerCase().equals("tenis"))
            field = "No se puede"
        else
            field = value
    }
}