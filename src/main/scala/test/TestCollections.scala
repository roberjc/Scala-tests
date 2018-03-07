package test

object TestCollections {
  def main(args: Array[String]){
   
    //Lists
    
    val fruit: List[String] = List("apples", "oranges", "pears")
        
    val nums: List[Int] = List(1, 2, 3, 4)
    
    val empty: List[Nothing] = List()
    
    val dim: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
        
    println("Final de lista: "+ fruit.tail)
    println("Inicio de lista: "+ fruit.head)
    println("¿Está vacía?: "+fruit.isEmpty)
    
    
    //Sets (Por defecto los conjuntos en Scala son inmutables)
    
    var s1: Set[Int] = Set()
    s1 = Set(1,2,3)
    
    var s2 = Set(4,5,6) //Inferencia tipos
    
    //Concatenar sets
    
    def concatenaSets(s1: Set[Int], s2: Set[Int]): Set[Int] = {
      var s3: Set[Int] = Set()
      
      s3 = s1 ++ s2
      
      return s3
    }
    
    
    //Maps (Por defecto también inmutables)
    
    var m: Map[Char, Int] = Map()
    
    var colors = Map(1 -> "red", 2 -> "blue")
    
    //Agregar registros
    colors += (3 -> "green")
    
    //Concatenar maps
    def concatenaMaps(m1: Map[Int, String], m2: Map[Int, String]) : Map[Int, String] = {
      
      var m3: Map[Int, String] = Map()
      
      m3 = m1 ++ m2
      
      //También está disponible el método .++ de los maps
      //m3 = m1.++(m2)   
      
      return m3
      
    } 
    
    //Iterar en un mapa por claves
    colors.keys.foreach{
        i => print("key: "+i)
             print("value: "+colors(i))
    }
    
    //Comprobar claves y reemplazar valores
    if(colors.contains(3)){
      colors.+((3, "yellow"))
      //Tambien se puede usar el operador +=
    }
    
    
    //Tuplas
    val t = Tuple3(2, "dos", 3)
    
    //Acceso a los elementos
    val suma = t._1 + t._3
    
    //Iterar por una tupla
    t.productIterator.foreach{
        i => println("valor: "+i)
    }
    
    //Intercambiar elementos (tuplas de 2 elementos)
    val t2 = Tuple2(1, 2)
    val swappedT2 = t2.swap
    
    
    //Options (Devuelven un tipo Some[T] si existe valor y None si no
    val something = colors.get(1) //Devuelve un objeto de tipo Some[String]
    
    //Pattern matching
    def show(x: Option[String]) = x match{
      case Some(someType) => someType
      case None => "¿?"
      case _ => "Default"  //_ indica el caso por defecto
    }
    
    show(something) //Devuelve el contenido del objeto de tipo Option, ya sea Some o None
    
    //Método getOrElse para devolver un valor o algo por defecto si no existe
    val a: Option[Int] = Some(5)
    a.getOrElse(0) //Devuelve 5 o 0 si el objeto Some fuera vacío
    
    
    //Iterators
    val it = Iterator("a", "b", "c")
    
    while(it.hasNext){
      println(it.next())
    }
    
    


  }
}