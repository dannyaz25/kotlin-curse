package com.enalgodon.webapp01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesConstantes()
        //tipoDeDatos()
        //sentenciaIf()
        // sentenciaWhen()
        // arrays()
        //mapas()
        //loops()
        //nullSafety()
        //funciones()
        classes()
    }
    /*
 *Aqui hablaremos de clases
 * */
    fun classes(){
        val brais = Programmer("Danny",31, arrayOf(Programmer.Language.KOTLIN,Programmer.Language.SWIFT))
        println(brais.name)
        brais.age =50
        val sara = Programmer("sara",35, arrayOf(Programmer.Language.GO,Programmer.Language.PHP),
            arrayOf(brais))
        sara.code()
        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")

    }
    /*
     * Aqui hablaremos de funciones
     * */
    fun funciones(){
        sayHello()
        sayHello()
        sayHello()
        sayMyName("Danny")
        sayMyName("Raul")
        sayMyNameAndAge("Brais",32)
        val sumResult:Int = sumTwoNumbers(10,5)
        println(sumResult)
        println(sumTwoNumbers(15,9))
        println(sumTwoNumbers(10, sumTwoNumbers(5,5)))
    }
    // Funcion simple
    fun sayHello(){
        println("Hola")
    }

    // Funciones con parámetros
    fun sayMyName(name: String){
        println("Hola,mi nombre es $name")
    }
    fun sayMyNameAndAge(name: String,age: Int){
        println("Hola,mi nombre es $name y mi edad es $age")
    }
    // Funciones con valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int): Int {
        val sum:Int = firstNumber +secondNumber
        return sum
    }
    /**
     * Aqui vamos hablar  de seguridad contra nulos (Null Safety)
     */

    fun nullSafety() {
        var myString = "MyString"
        //myString = null Esto daría un error de compilación
        println("Hello, world!!!")
        // Variable null safety
        var mySafetyString: String? ="Movudssss"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Suscribete!"
        //println(mySafetyString)

        /*if(mySafetyString != null){
            println(mySafetyString!!)
        }else {
            println(mySafetyString)
        }*/

        // Safe call
        println(mySafetyString?.length)
        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }

    }
    /*
    Aqui hablaremos de loops
    * */
    fun loops(){

        // Bucles
        val myArray:List<String> = listOf("Hola","Bienvenido Tutorial","Suscribete")
        val myMap:MutableMap<String,Int> = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        // For
        for (myString: String in myArray){
            println(myString)
        }
        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x  in 0..10){
            println(x)
        }

        for (x  in 0 until 10){
            println(x)
        }

        for (x  in 0..10 step 2){
            println(x)
        }

        for (x  in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNumb in myNumericArray){
            println(myNumb)
        }

         // While
            var x = 0
        while(x<10){
            println(x)
            x+=2
        }
        

    }
    /*
    Aqui hablaremos map o diccionario
    * */
    fun mapas(){
        // Sintaxis
        var myMap:Map<String,Int> = mapOf()
        println(myMap)

        //Añadir Valores
        myMap = mutableMapOf("Brais" to 1,"Pedro" to 2,"Sara" to 5)// mapOf("Brais" to 1,"Pedro" to 2,"Sara" to 5)
        println(myMap)
        //Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)

        myMap.put("Brais",3)
        println(myMap)

        myMap.put("Marcos",3)
        println(myMap)

        //Acceso a datos
        println(myMap["Brais"])

        //Actualizando un dato
        myMap["Brais"] = 4

        //Eliminar datos
        myMap.remove("Brais")
        println(myMap)

    }
    /*
    * aqui hablamos de arrays
    * */
    fun arrays(){
        val name = "Brais"
        val surName = "Moure"
        val company = "MoureDev"
        val age = "32"
        // Creacion de un array
        val myArray = arrayListOf<String>()
        myArray.add(name)
        myArray.add(surName)
        myArray.add(company)
        myArray.add(age)

        println(myArray)
         //Añadir un conjunto de datos
        myArray.addAll(listOf("Hola","Bienvenidos"))
        println(myArray)

        //Acceso a Datos
        val myCompany = myArray[2]
        println(myCompany)

        //Modificar Datos
        myArray[5] =  "Suscribete y Activa la campana"
        println(myArray)

        //Eliminar datos
        myArray.removeAt(4)
        println(myArray)

        //Rerror Datos
        myArray.forEach {
            println(it)
        }

        //Otras Operaciones
        myArray.count()
        myArray.clear()
        println(myArray.count())
        myArray.first()
        myArray.last()
        myArray.sort()

    }
    /*
    Aqui vamos a hablar de la sentecia when
    * */
    fun sentenciaWhen(){
        // when con string
        val country = "sss"
        when(country){
            "Espania" -> {
                println("espaniol Espania")
            } "Mexico" -> {
                println("espaniol Mexico")
            } "Francia" -> {
                println("El idiom es Frances")
            } else -> {
            println("No hay idioma")
        }
        }
        // when con Int
        val age = 71
        when(age) {
            0, 1, 2 ->{
                println("eres un bebe")
            } in 3 .. 10 ->{
                println("eres un ninio");
            } in 11 .. 17 -> {
                println("Eres un adolescente")
            } in 18 .. 69 -> {
                println("Eres adulto")
            } in 70 .. 99 ->{
                println("Eres anciano")
            } else -> {
                println(":(")
            }
        }
    }

    /*
    Aqui vamos hablar de la sentencia if
    */
    private fun sentenciaIf(){
    var myNumber = 71
        // Operadores condicionales
        // >mayor que
        // <menor que
        // >=  mayor igua lque
        // <= meonor igua que
        // == (= =) igualdad
        // != (! =) desigualdad
        // Operadores logicos
        // && operador y
        // ||  operador o
        // ! operador no


        if((myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que  5 o igual 53")

        } else if( myNumber == 60){ println("$myNumber es igual a 60")

        } else {
            println("$myNumber es mayor que 10 o menor igual a 5 y no es igual a 53")
        }


    }

    /*
    Aqui vamos a hablar de tipos de datos (data types)
    * */
    private fun tipoDeDatos(){
        // String
        val myString: String = "Hola danny"
        val myString2 = "Algodon"
        val myString3 = myString + " " + myString2
        println(myString3)

        //Enteros (Byte, Short, Int, Long)
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales(Float,Double)
        val myFloat: Float =  1.5f
        val myDouble =1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 // es int
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean(Bool)
        val myBool : Boolean = true
        val myBool2 = false
       // val myBool3 = myBool + myBool2
        println(myBool != myBool2)
        println(myBool && myBool2)

    }
    /*
    Aqui vamos a hablar de variables y constantes
    * */
    private fun variablesConstantes() {
        // Variables
        var myFirstVariable = "En Algodon.....!"
        var myFirstNumber = 1
        println(myFirstVariable)

        myFirstVariable = "En Algodon 2.0 ....!"
        println(myFirstVariable)

        //No podemos asignar un tipo Int a una variable de tipo String
        //myFirstVariable = 1

        var mySecondVariable = "Suscribete!"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        myFirstVariable = "Ya te has suscrito!"
        println(myFirstVariable)

        // Constantes
        val myFirstConstant = "Te ha gustado?"
        println(myFirstConstant)

        //Una constante no puede modificar su valor
        //myFirstConstant = "ffff"

        val mySecondConstant = myFirstVariable
        println(mySecondConstant)


    }

}