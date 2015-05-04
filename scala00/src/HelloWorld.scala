/**
 *
 */
/**
 * @author danilo
 *
 */
object HelloWorld {
  def xPlusY(i: Int, j: Int) = i + j
  
  def plusOne(i: Int) = xPlusY(1,i)
  
  var plusOneVar = (i: Int) => xPlusY(1,i)
  
  def demoOne() =
  {
    var i = 10
    plusOne(i)
  }
  
  def demoOneVar() =
  {
    var i = 10
    plusOneVar(i)
  }
  
  def main(args: Array[String]): Unit =
  {
   println("Hello World!") 
   println(demoOne())
   println(demoOneVar())
   
   // demoTwo()
  }  
  
  
def xPlusYRecursive(x: Int, y: Int): Int = if (x==0) y else xPlusYRecursive(x-1,y) + 1
    
  
  def demoTwo() {
    var addMe = 10
    var i = 20
    
    var plusAddMe = (i: Int) => xPlusYRecursive(addMe,i)
    
    println(plusAddMe(i))
    
    addMe = 12
    
    var f2 = xPlusYRecursive(addMe,i)
    
 
    println(f2)

    println(plusAddMe(i))
   
  }

}

