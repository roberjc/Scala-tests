package test

object Test {
  def main(args: Array[String]){
    
    var point1 = new Point(4,6)
    point1.getCoordX()
    point1.getCoordY()
    point1.move(1, 7)
    point1.getCoords()
    
    print("-----------\n")
    
    val l1 = new LocPoint(1,2,5)
    l1.locMove(2, 4, 8)
    
    print("-----------\n")
    
    // # FOR Loops
    for(a <- 1 to 10; b <- 1 until 3){
      println("a: "+a)
      println("b: "+b)
    }
    
    print("-----------\n")
    
    val numList = List(1,2,3,4,5,6);
    
    for(i <- numList if i != 3; if i < 5 ){
      println("i: "+i)
    }
    
    print("-----------\n")
    
    // Convierte en una lista lo que va iterando
    val retVal = for{a <- numList if a>0; if a!=2}yield a
    
    for(a <- retVal){
      println("a: "+a)  
    }
    
    print("-----------\n")
    
    //WHILE Loops
    var i = 10
    
    do{
      println("i: "+i)
      i = i+1
    }
    while(i<20)
    
    print("-----------\n")
    
    
    //Arrays
    
    // Init
    var array1 = new Array[String](3)
    var doubleList = Array(1.9, 2.9, 3.4, 3.5)
    // Ejemplo de closure
    var max = doubleList(0)
    
    array1 = Array("a","b","c")
    
    var total = 0.0
    
    // Summing all elements
    def sumElements(): Double = { 
      for(x <- doubleList){
        total += x
      }
      return total
    }
    
    def sumElements2(): Double = { 
      for(x <- 0 to doubleList.length -1){
        total += doubleList(i)
      }
      return total
    }
    
    // Finding the largest element
    def findLargestElement(): Double ={
      for(x <- doubleList){
        if (x > max) max = x 
      }
      return max
    }
    
    
    //Lists
    
    val fruit: List[String] = List("apples", "oranges", "pears")
        
    val nums: List[Int] = List(1, 2, 3, 4)
    
    val empty: List[Nothing] = List()
    
    val dim: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
        
    println("Final de lista: "+ fruit.tail)
    println("Inicio de lista: "+ fruit.head)
    println("¿Está vacía?: "+fruit.isEmpty)
    
    
    


  }
}