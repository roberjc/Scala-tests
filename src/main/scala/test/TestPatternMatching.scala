package test

object TestPatternMatching {
  def main(args: Array[String]){
    val p1 = new Point(1,3)
    val p2 = new Point(4,2)
    val p3 = new Point(9,4)
    
    //Se implementa una clase de tipo case para poder utilizar sus objetos en el matching
    for(pt <- List(p1, p2, p3)){
      pt match{
        case Point(1,3) => println("Punto 1")
        case Point(4,2) => println("Punto 2")
        case Point(x, y) => println(
               "CoordX: " + x + ", CoordY: " + y)
      }
    }
    
  }
  
  case class Point(x: Int, y: Int)
  
}