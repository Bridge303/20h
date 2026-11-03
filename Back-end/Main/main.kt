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
    println("test")
    var user1Info = user1.getUserInfo()
    println(user1Info)
    var location1 = Location(
        2.32,
        0.32,
        9.12
    )
    var location1Info = location1.retrieveLocation()
    println(location1Info)
}