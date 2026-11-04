import Classes.User
import Classes.Location


fun main ()
{
     val user1 = User(
        "Name1",
        "username1",
        "124azeza",
        "emailofUserOne",
        12521523,
        321312,
        true
    )
    val location1 = Location(3.0,3.32,9.2)
    var user1E = user1.getUserInfo()
    println(user1E)
    var location1E = location1.retrieveLocation()
    println(location1E)

}