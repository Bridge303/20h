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
    {
        if (is_user_child == true) 
        {
        this.is_user_child = false
        }
        if (is_user_child == false) 
        {
        this.is_user_child = true
        }
    }
    fun getUserInfo() : String 
    {
        return "Name: $name, Username: $user_name, Email: $email"
    }
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
    init 
    {
        if (this.child_family.isNullOrEmpty() && this.other_child_family_trees.isNullOrEmpty())
        {
            //Make a Familytree instantly upon becoming a child
        } 
    }
    fun inviteParentToFamilyTree(userID : Int, family_tree : FamilyTree) // Still have to add a way to check so not just anyone can add anybody to any famillytree
    {
        // var user : Parent 
        // // user = getuserfromdatabse(userID)                                   /**  fetch user itself not just Id but need Database for that */
        // family_tree.family_tree_members.add(user)
      
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
