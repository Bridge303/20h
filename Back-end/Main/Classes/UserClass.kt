package Classes



//                          Main User class
open class User(
                var name : String,
                var user_name : String,
                var password : String,
                var email : String,
                var phone_number : Int,
                var user_ID : Int,
                var is_user_child : Boolean
                ) 
{
    fun changeUserSubclass()                                // add / find way to change subclass !!!
    {                                                       // Might be problems with the fact that if the user 
        if (is_user_child == true)                          // - is not assigned something when this functions is called that its auto assigns subclass
        {
        this.is_user_child = false
        }
        else if (is_user_child == false) 
        {
        this.is_user_child = true
        }
        else 
        {
            var error : String = "User.ChangeUserSubclass.nonexistingsubclass"
            println("Something went wrong when changing user Category")
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


//                          Subclasses from User : 

class Child(
            name: String,
            user_name: String,
            password: String,
            email: String,
            phone_number: Int,
            user_ID: Int,
            is_user_child : Boolean,
            val emergency_contacts : MutableList<User> = mutableListOf(),
            val child_family : MutableList<FamilyTree> = mutableListOf(),
            val other_child_family_trees : MutableList<FamilyTree> = mutableListOf(),
            val latest_locations_list : MutableList<Location> = mutableListOf()
            ) : User(name, user_name, password, email, phone_number, user_ID, is_user_child)
{
    init {this.child_family.add(childMakeTree(this))} // Makes a familyTree for the child upon creation of Child(Object)
    
    fun inviteParentToFamilyTree(userID : Int, family_tree : FamilyTree) // Still have to add a way to check so not just anyone can add anybody to any famillytree
    {
        var user : User 
        user = searchForUserInDatabase(userID)   /**  fetch user itself not just Id but need Database for that */
        if (checkUserSubClass == 2) 
        {
            family_tree.family_tree_members.add(user)
        }                                
        else 
        {
            var error : String = "Child.InviteParentToFamilyTree = isnotaParent"
            println("The user you want to add is not a Caregiver")
        }
    }
    fun makeParentAdministrator(userID : Int, family_tree : FamilyTree) 
    {
        var user_found = searchForUserInDatabase(userID)
        if (checkUserSubClass(user_found) = 2) 
        {
            if (checkIfUserIsInTree(user_found,family_tree))
            {
                this.child_family.family_tree.family_tree_administrator.add(user_found)     // Might be wrong syntax to target the list
            }
            else 
            {
                var error : String = "makeParentAdministrator.personNotInFamilyTree"
                println("Given person is not in your FamilyTree")
            }
        }
        else 
        {
            var error : String = "makeParentAdministrator.personNotEligible"
            println("Given person is not eligible to be Administrator of the FamilyTree")
        }
    }
}
class Parent(
            name: String,
            user_name: String,
            password: String,
            email: String,
            phone_number: Int,
            user_ID: Int,
            is_user_child : Boolean,
            var family_tree : FamilyTree,
            var is_adminstrator_of_tree : Boolean, // Optional for checking if he is "administrator"   ???
            var list_admin_trees : MutableList<FamilyTree> = mutableListOf()
            ) : User(name, user_name, password, email, phone_number, user_ID, is_user_child)
{

}
