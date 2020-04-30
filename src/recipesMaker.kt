fun getResponse(fn:() -> Unit) {
    val response:String = readLine() ?: "9"
    when(response.toInt()) {
        8 -> makeRecipe()
        9 -> menu()
        else -> fn()
    }
}

fun selectIngredient(response: Int) {
    when(response) {
        1 -> dairy()
        2 -> vegetables()
        3 -> fruits()
        4 -> cereals()
        5 -> meats()
        6 -> oils()
        9 -> menu()
    }
}

fun cereals() {
    val msg: String = """
    Estos son los cereales disponibles:
        1. Maiz
        2. Arroz
        3. Pan
        4. Cupcakes
        
        8. Volver al menu de Categorias
        9. Volver al menu de Inicio
    """.trimIndent()
    println(msg)
    getResponse(::cereals)

}

fun dairy() {
    val msg: String = """
    Estos son los lacteos disponibles:
        1. Leche
        2. Yogurt
        3. Queso
        4. Mantequilla
        5. Quesillos
        
        8. Volver al menu de Categorias
        9. Volver al menu de Inicio
    """.trimIndent()
    println(msg)
    getResponse(::dairy)
}

fun fruits() {
    val msg: String = """
    Estas son las frutas disponibles:
        1. Fresa
        2. Platano
        3. Uvas
        4. Manzana
        5. Naranja
        
        8. Volver al menu de Categorias
        9. Volver al menu de Inicio
    """.trimIndent()
    println(msg)
    getResponse(::fruits)
}

fun vegetables() {
    val msg: String = """
    Estas son las verduras disponibles:
        1. Zanahoria
        2. Tomates
        3. Brocoli
        4. Cebolla
        5. Arbejas
        
        8. Volver al menu de Categorias
        9. Volver al menu de Inicio
    """.trimIndent()
    println(msg)
    getResponse(::vegetables)

}

fun meats() {
    val msg:String = """
    Estas son las Carnes disponibles:
        1. Carne de res
        2. Pollo
        3. Carne de cerdo
        4. Pavo
               
        8. Volver al menu de Categorias
        9. Volver al menu de Inicio
    """.trimIndent()
    println(msg)
    getResponse(::meats)
}

fun oils() {
    val msg:String = """
    Estos son los Aceites disponibles:
        1. Aceite de oliva
        2. Aceite de almendras
        3. Aceite de coco
        4. Aceite vegetal
        
        8. Volver al menu de Categorias
        9. Volver al menu de Inicio
    """.trimIndent()
    println(msg)
    getResponse(::oils)
}

fun makeRecipe() {
    val msg: String = """
        :: Hacer receta ::
    Selecciona por categoría el ingrediente que buscas
        1. Lacteos
        2. Verduras
        3. Frutas
        4. Cereales
        5. Carnes
        6. Aceites

        9. Volver al Menu de Inicio
    """.trimIndent()
    println(msg)
    val response:String = readLine() ?: "9"
    selectIngredient(response.toInt())
}


fun menu() {
    val msg: String = """
        ::Welcome to Reciper Maker::
    Seleccione la opción deseada:
    
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir...
        
    """.trimIndent()
    println(msg)


    println("Ingrese la opción deseada! 🙏 \n")
    val response:String = readLine() ?: "4"
    when(response.toInt()) {
        1 -> makeRecipe()
        2 -> println("Cargando recetas... \n \n")
        3 -> println("Seleccionaste salir del programa!\n\n")
        else -> {
            println("Opcón no válida \n\n")
            menu()
        }
    }
}

fun main() {
    menu()
}
