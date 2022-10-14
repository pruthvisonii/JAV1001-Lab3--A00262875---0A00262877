/*JAV1001 App Development for Android -- LAB 03

STUDENT NAME STUDENT ID

Pruthvi Soni - A00262875 - Mobile Application Development

Sakshi Sheth - A00262877 - Mobile Application Development

-- Contributions of Project ---

Pruthvi Soni - Die file and github

Sakshi Sheth Die game file
*/
//Main Class with constructors
class Die(var typeofdie: String, var numberofsides: Int = 0, var currentside: Int = 0)
{
//Get methords
    fun getname(): String = typeofdie.toString()
    fun getnumberofsides(): Int = numberofsides
    fun getcurrentside(): Int = currentside

    //A 0 argument constructor
    fun Die(){
        typeofdie = "d6"
        numberofsides = 6
   }
    //A 1 argument constructor
    fun Die(numberofsides: Int) {
        this.typeofdie = "d" + numberofsides
        this.numberofsides = numberofsides
    }
    //A 2 argument constructor
    fun Die(numberofsides: Int, typeofdie: String) {
        this.numberofsides = numberofsides
        this.typeofdie = typeofdie
    }
    // Random roll methord
    fun setRollSide() {
        currentside = (Math.random() * numberofsides + 1).toInt()
    }

    fun setRollMaxSide() {
        currentside = numberofsides
    }

}