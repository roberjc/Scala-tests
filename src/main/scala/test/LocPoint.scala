package test

// Si esta clase hereda a otra, la original tendrá que declarar variables inmutables
class LocPoint (override val xc: Int, override val yc: Int, zc: Int) extends Point(xc, yc){
  
  private[this] var z: Int = zc
  
  def locMove(dx: Int, dy: Int, dz: Int){
    x = x + dx
    y = y + dy
    z = z + dz
    
    val(coordX, coordY, coordZ) = Tuple3(x,y,z)
    println("Coordenadas location: " + (coordX, coordY, coordZ))
  }
}