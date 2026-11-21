package Classes
import Functions.*

//          Enum = Constant variables : either Parent or Child | So var Userole can only be one of it's CONSTANTS

enum class ConnectionStatus {
    CONNECTED,
    DISCONNECTED,
    PENDING,
    UNKNOWN
}

enum class UserRole {
    PARENT,
    CHILD
}

//                               Main : User  =>   Which can split into PARENT & CHILD
class User(
                var name : String,
                var user_name : String,
                var password : String,
                var email : String,
                var phone_number : Int,
                var user_ID : Int,
                // var is_user_child : Boolean,     //cant be because it can be unassigned now with user_role being able to be NULL and Booleans dont see that
                var user_role : UserRole
                ) 
{
    init { println("Your account has been made! Hello $user_name!")}

    var parentData: ParentData? = null
    var childData : ChildData? = null


    // this is a Check for wheter or not the user who uses a function 1. has that role to do so 2. wether it has initialized data of that role
    // this avoids crashes or unexpected behavior when calling a function
    fun <T> withParentData(action: ParentData.() -> T): T? {
        if (user_role != UserRole.PARENT) { println("User is not a Parent"); return null}
        if(parentData == null)  { println("User does not have PARENT DATA"); return null}
        return parentData?.action()
    }   
    // this is a Check for wheter or not the user who uses a function 1. has that role to do so 2. wether it has initialized data of that role
    // this avoids crashes or unexpected behavior when calling a function
    fun <T> withChildData(action: ChildData.() -> T): T? {      
        if (user_role != UserRole.CHILD) { println("User is not a Child"); return null}
        if(childData == null)  { println("User does not have CHILD DATA"); return null}
        return childData?.action()
    }


    fun changeUserRole(selected_role : UserRole)       // still needs some tweaks like when selecting one that x happens with other subclass                         
    {                                                     
        user_role = selected_role

        when (selected_role)    // already looking at selected role so no need to selected_role.UserRole.PARENT
        {
            UserRole.PARENT -> {
                if (parentData == null) 
                {
                    parentData = ParentData(
                        user_owner_of_data = this,
                        // Fill in with requests for possible data 
                    )
                    println("You are now a Parent!")
                }
                else {
                    println("You already are a Parent as role.")
                }
                // Delete the users ChildData?
            }
            UserRole.CHILD -> {
                if (childData == null) 
                {
                    childData = ChildData(
                        user_owner_of_data = this
                        // Fill in with request for possible data
                    )
                    println("You are now a care-receiver!")
                }
                else {
                    println("You already are a care-receiver as role.")
                }
                // Delete the Users ParentData?
            }
        }
    }
    
    // simple User user_name change
    fun changeUserName(given_user_name : String) { 
        user_name = given_user_name
        println("Your user name is now $given_user_name")
    }

    fun changeUserPassword(){

    }

    fun changeUserEmail(){

    }

    fun changeUserPhoneNumber(){

    }

    fun getUserInfo() : String {
        return "Name: $name, Username: $user_name, Email: $email"
    }

    fun getUserUserName() : String {
        return user_name
    }

    fun getUserID() : Int {
        return user_ID
    }

    fun inviteMemberToFamilyTree(userID : Int, family_tree : FamilyTree) { // Still have to add a way to check so not just anyone can add anybody to any famillytree
        if (this in family_tree.family_tree_administrator || this == family_tree.family_first_child){
            var temp_user = searchForUserInDatabase(userID)
            var temp_user_name = temp_user.getUserUserName()
            var temp_family_tree_name = family_tree.getFamilyTreeName()
            family_tree.family_tree_members.add(searchForUserInDatabase(userID))

            println("The person $temp_user_name has been added to the members list of familytree : $temp_family_tree_name")
        }
        else{
            println("You do not have the rights to do these actions.")
        }
    }
}
