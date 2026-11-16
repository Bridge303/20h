import Classes.*
import Functions.*



fun main ()
{
     val user1 = User(
        "Name1",
        "username1",
        "124azeza",
        "emailofUserOne",
        12521523,
        321312,
        UserRole.CHILD
    )
    val user2 = User(
        "Name2",
        "username2",
        "124azeza",
        "emailofUserOne",
        12521523,
        321312,
        UserRole.CHILD
    )
    user1.changeUserRole(UserRole.CHILD) // has to be here otherwise no role so cant be child and has NuLL as userRole
    var userfamilytree1 = FamilyTree(
        family_first_child = user1,
        family_extra_childs = mutableListOf(),
        family_tree_administrator = mutableListOf(),
        family_tree_members = mutableListOf(),
        family_tree_name = "noname" 
    )
    val location1 = Location(3.0,3.32,9.2)
    var user1E = user1.getUserInfo()
    println(user1E)
    var location1E = location1.getLocationData()
    println(location1E)
    println(checkUserSubClass(user1))
    user1.inviteMemberToFamilyTree(21,userfamilytree1)  // should 
    user2.inviteMemberToFamilyTree(21,userfamilytree1)  // test if access works | note it works but its still bcs there is no search bcs no database so it will create instead of search for the userID 
}