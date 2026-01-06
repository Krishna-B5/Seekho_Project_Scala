/* output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
object pattern_1 {
  def main(args:Array[String]):Unit={
    for(i <- 1 to 5 by 1 ){
      for(j <- 1 to i){
        print(j+" ")
      }
      println()
    }
  }
}
