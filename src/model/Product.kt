package model

abstract class Product(var name:String, var description: String, var sku: Int) {
    override fun toString(): String {
        return "\nName: $name \nDescripción: $description \nSKU: $sku"
    }
}