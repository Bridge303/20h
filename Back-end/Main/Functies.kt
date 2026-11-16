package Functions
import Classes.*

//         Server sided functions           //

// Get a new location for user given
fun getNewLocation(user : User) : Location {
    var locationExmple =  Location(
        1.21,
        1.21,
        1.23
    )
    return locationExmple
}

// Check latest given location by server
fun checkLatestLocation(user : User) : Location{
    // pass
    var locationExmple = Location(
        1.21,
        1.21,
        1.23
    )
    return locationExmple
}

// change the timer for when the sever should ping 
fun changeTimeAlert() {
    // pass
}

//  Check if is adminstrator so not everybody can just change settings
fun checkIfUserIsAdminstratorOfTree() : Boolean{
    //pass
    return false
}

// Check if user is the "Child" Owner of a Tree 
fun checkIfUserIsChildOwnerOfTree() : Boolean{
    //pass 
    return false 
}

    // Gives numbers from 1-X back and can see if User is (0)undefined, just (1)User, (2)Parent or (3) Child respectively
fun checkUserSubClass(user : User) : UserRole{
    var temp_user_UserRole = user.user_role
    return temp_user_UserRole
}

// Checks if the user is in the given tree so it doesnt accidently change stuff when not in tree (safety check aswel)
fun checkIfUserIsInTree(user : User, family_tree : FamilyTree) : Boolean {
    //pass 
    return false
}

// Search for a user in database with given info and return the Object User itself
fun searchForUserInDatabase(userID : Int) : User{
    //pass
    val user1 = User(
        "Name1",
        "username1",
        "124azeza",
        "emailofUserOne",
        12521523,
        321312,
        UserRole.CHILD
    )
    return user1
}

// makes a tree for the Child       // Make sure that it doesnt need more information then possibly given upon creation for User.CHILD Init function
fun childMakeTreeInitialization(user_making_the_tree : User) : FamilyTree{
    var thisUsersFamilyTree = FamilyTree(
        family_first_child = user_making_the_tree,
        family_extra_childs = mutableListOf(),
        family_tree_administrator = mutableListOf(),
        family_tree_members = mutableListOf(),
        family_tree_name = "noname" // should be a request for a name 
    )
    return thisUsersFamilyTree
}
// server sided Alert to ping the family members
// Different type of alerts :

// When there is no movement or recent activity on the phone or other (devices???)
fun alertWhenNoActivityDetected() {
    // pass
}

// When there is simply no connection with the phone (It gives back no connection like : dead battery, broken phone, no internet....)
fun alertWhenNoConnectionEstablishedWithElder(){
    //pass
}



//          No account yet or needed :          //

// Login to already made account
fun login() {
    // pass
}

// Make account 
fun signUp() {
    // pass
}




//      Database <=> App Requests


// fun serverConnectionStatus() : ConnectionStatus{
//     if (ConnectionStatus == PENDING) {
//         println("You are still attempting connecting with the servers of the App")
//         return PENDING
//     }
//     if (ConnectionStatus == CONNECTED) {
//         println("You are Connected with the servers of the App")
//         return CONNECTED
//     }
//     if (ConnectionStatus == DISCONNECTED) {
//         println("You are Disconnected with the servers of the App")
//         return DISCONNECTED
//     }
//     return UNKNOWN
// }