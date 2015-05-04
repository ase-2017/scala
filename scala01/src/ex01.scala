import scala01.Person

object ex01 {
  var persons = List(new Person("Bob","male",182,List("Peter","Mary")),new Person("Alice","female",182,List("Harry","Sally")))

  def grandparent(n: String): List[Person] = { 
    // This is not the final implementation :-), just test data so that you can see something
    //
    persons
    }
 
	def main(args: Array[String]): Unit =
		{

      // Your task: Same as in Prolog, enter your family tree
      // create a function which returns list of grandparents by given name
      // hint: use Scala Collections operations like "filter" 
      // http://docs.scala-lang.org/overviews/collections/overview.html
    
      // This prints the  names of the grandparents
      grandparent("Bob").map { x => println(x.name) }
      
		}
}