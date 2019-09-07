package features.steps
import cucumber.api.scala.{EN,ScalaDsl}

import cucumber.api.junit.Cucumber

object StepDefs extends ScalaDsl with EN {



  Given("""a variable x with value {int}"""){ (arg0:Int) =>
    //// Write code here that turns the phrase above into concrete actions
    //throw new PendingException()
    println("Hello, world1!")
  }
  Given("""a variable y with value {int}"""){ (arg0:Int) =>
    //// Write code here that turns the phrase above into concrete actions
    //throw new PendingException()
    println("Hello, world2!")
  }
  When("""I multiply x * y"""){ () =>
    //// Write code here that turns the phrase above into concrete actions
    //throw new PendingException()
    println("Hello, world3!")
  }
  Then("""I get {int}"""){ (arg0:Int) =>
    //// Write code here that turns the phrase above into concrete actions
    println("Hello, world4!")
   MyETLFun.take_count()
    // throw new PendingException()
  }





//  Given("""below values are to be cheched:"""){ (arg0:Class) =>
    //// Write code here that turns the phrase above into concrete actions
   // throw new PendingException()
 // }


  def main(args: Array[String]): Unit = {
    println("Hello, world Main!")
  }

}



