import Classes.User
import Classes.Child
import Classes.Location


//         Server sided functions           //

// Get a new location for user given
fun getNewLocation(user : Child) : Location {

}

// Check latest given location by server
fun checkLatestLocation(user : Child) : Location{
    // pass
}

// change the timer for when the sever should ping 
fun changeTimeAlert() {
    // pass
}

//  Check if is adminstrator so not everybody can just change settings
fun checkIfUserIsAdminstratorOfTree() : Boolean{
    //pass
}

// Check if user is the "Child" Owner of a Tree 
fun checkIfUserIsChildOwnerOfTree() : Boolean{
    //pass 
}

    // Gives numbers from 1-X back and can see if User is (0)undefined, just (1)User, (2)Parent or (3) Child respectively
fun checkUserSubClass(user : User) : Int{
    //pass
}

// Checks if the user is in the given tree so it doesnt accidently change stuff when not in tree (safety check aswel)
fun checkIfUserIsInTree(user : User, family_tree : FamilyTree) : Boolean {
    //pass 
}

// Search for a user in database with given info and return the Object User itself
fun searchForUserInDatabase(userID : Int) : User{
    //pass
}

// makes a tree for the Child
fun childMakeTree(user_making_the_tree : Child) : FamilyTree{
    //pass
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


// Change user from parent or child or just User to either 
fun changeUserType() {
    // pass
}





//          Not yet decided if general function or user specific            //



var SHOULD_BE_FOR_PARENT_ADMINSTRATOR_AND_CHILD_ADMINSTRATOR_OF_FAMILYTREE = ""
// Add somebody to the familytree as CHILD/ADMINISTRATOR of that familytree | User should be able to select which FamilyTree
// Should be in UserClass               ???
fun addToFamily(var chosen_familytree : FamilyTree,var chosen_user : User) {
    // pass
}





