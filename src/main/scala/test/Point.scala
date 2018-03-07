package test

// No hace falta declarar el si es var o val los parametros
class Point(val xc: Int, val yc: Int) extends EqualTrait {
  
  // Solo se pueden reasignar variables mutables
  // Si se hacen privadas las variables, no se pueden heredar
  // private[this] var x: Int = xc
  
  var x: Int = xc
  var y: Int = yc
  
  // Tampoco se declara si var o val
  def move(dx: Int, dy: Int){
    x = x + dx
    y = y + dy
    
    println("Coordenada x: "+ x)
    println("Coordenada y: "+ y)
  }
  
  def getCoordX(){
    println("Coordenada x: "+x)
  }
  
  def getCoordY(){
    println("Coordenada y: "+y)
  }
  
  def getCoords(){
    val(coordX, coordY) = Tuple2(x, y)
    println("Coordenadas: "+ (coordX, coordY))
  }
  
  //Se establece que el objeto sin tipo sea del tipo Point y
  //como instancia de ese tipo, se establecen las propiedades de
  //la función isEqual
  def isEqual(obj: Any ) = {
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].getCoordX() == getCoordX() &&
    obj.asInstanceOf[Point].getCoordY() == getCoordY()

  }
}

















