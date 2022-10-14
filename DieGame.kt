/*JAV1001 App Development for Android -- LAB 03

STUDENT NAME STUDENT ID

Pruthvi Soni - A00262875 - Mobile Application Development

Sakshi Sheth - A00262877 - Mobile Application Development

-- Contributions of Project ---

Pruthvi Soni - Die file and github

Sakshi Sheth Die game file
*/

//Create different sized dice using each constructor
fun main(args: Array<String>) {
    val  s4 = Die(4.toString())
    val  s6 = Die(6.toString())
    val  s8 = Die(8.toString())
    val arrayOfDice = arrayOf(s4, s6, s8)


//Roll the dice and display their results
    println("Creating a default " + s4.getname())
    println("Creating a default " + s6.getname())
    println("Creating a default " + s8.getname())

    println("Testing the roll method")

    //format spacing
    println()

    //The sides of the dice after rolling
    s4.setRollSide()
    s6.setRollSide()
    s8.setRollSide()
    println()

    println("Rolling" +s4.getname()+"....." +'\n'+ "The new value is "+ s4.getcurrentside())
    println("Rolling" +s6.getname()+"....." +'\n'+ "The new value is "+ s6.getcurrentside())
    println("Rolling" +s8.getname()+"....." +'\n'+ "The new value is "+ s8.getcurrentside())
    println()
    println("Testing the roll method")

    val index = (Math.random() * 3).toInt() //This generates the random indexes of the array ( between 0 and 2)
    println("Setting the " + arrayOfDice[index].getname() +" dice to show "+arrayOfDice[index].getnumberofsides()+'\n')


//Choose one Die object and set it to show it's highest value
    arrayOfDice[index].setRollMaxSide()
    println("The side up is now "+arrayOfDice[index].getcurrentside()+'\n')
}
