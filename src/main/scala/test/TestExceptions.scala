package test

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object TestExceptions {
  def main(args: Array[String]){
    
      try{
        val f = new FileReader("/.md")
      } catch{
        case ex: FileNotFoundException => {
          println("Non-existing file")
        }
      case ex: IOException => {
            println("IO Exception")
         }
      } finally {
         println("Exiting finally...")
      }
  }
}