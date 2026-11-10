package Classes


//          Enum = Constant variables : either Parent or Child | So var Userole can only be one of it's CONSTANTS
enum class UserRole {
    PARENT,CHILD
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
    var parentData: ParentData? = null
    var childData : ChildData? = null

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
                        // Fill in with requests for data 
                    )
                }
            }
            UserRole.CHILD -> {
                if (childData == null) 
                {
                    childData = ChildData(
                        user_owner_of_data = this
                        // Fill in with request for data
                    )
                }
            }
        }
    }
    // Change Name or phone number etc....      // try to not give the user free will by typing what thye wanna change only select * just saying for safety
    fun changeUserInfo() { 
        //pass
    }
    fun getUserInfo() : String 
    {
        return "Name: $name, Username: $user_name, Email: $email"
    }
    fun getUserUserName() : String 
    {
        return "$user_name"
    }
    fun getUserID() : Int 
    {
        return user_ID
    }
    init { println("Your account has been made! Hello $user_name!")}
}
