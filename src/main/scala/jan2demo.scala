object jan2demo {

  def main(args:Array[String]):Unit= {

    println("Welcome to Scala, Krishna")

    for(i <- 1 to 5 by 1){
      println("Next loop "+i)
      println("Value of I:"+i+" ")
      for(j <- 1 to i){
        println("Value of J:"+j+" ")
      }
    }
  }
}
