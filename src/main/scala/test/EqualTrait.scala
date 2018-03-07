package test

trait EqualTrait {
  //Las variables en los traits deben ser inicializadas
  val exampleVal: String = ""
  
  def isEqual(x: Any): Boolean 
  
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}