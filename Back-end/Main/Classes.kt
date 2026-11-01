package classes 


// Main User class
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
    fun changeUserSubclass() 
    {
        if (is_user_child = true) 
        {
        this.is_user_child = false
        }
        if (is_user_child = false) 
        {
        this.is_user_child = true
        }
    }
    fun getUserInfo() : String 
    {
        return "Name: $name, Username: $user_name, Email: $email"
    }
}

class FamilyTree(
                
                val family_extra_childs: MutableList<Child> = mutableListOf(),
                val family_tree_administrator : MutableList<Parent> = mutableListOf(),
                var family_tree_members : MutableList<Parent> = mutableListOf()
                ) 
{
    fun getFamilyTreeChilds(): String 
    {
        var temp_extra_child_list = ""
        for (user in family_extra_childs) 
        {
            val name_of_child: String = user.name
            temp_extra_child_list += "$name_of_child "
        }
        return "Patients: $temp_extra_child_list"  // Needs better name then "Patients"
    }
    fun getFamilyTreeAdministrators(): String 
    {
        var temp_extra_admin_list = ""
        for (user in family_tree_administrator) 
        {
            val name_of_child: String = user.name
            temp_extra_admin_list += "$name_of_admin "
        }
        return "Administrators: $temp_extra_admin_list"  
    }
    fun getFamilyTreeMembers(): String 
    {
        var temp_extra_members_list = ""
        for (user in family_tree_members) 
        {
            val name_of_members: String = user.name
            temp_extra_members_list += "$name_of_members "
        }
        return "Members: $temp_extra_members_list"  
    }
}

// Subclasses from User : 
class Child(
            val emergency_contacts : MutableList<User> = mutableListOf(),
            val child_family : MutableList<FamilyTree> = mutableListOf(),
            val other_child_family_trees : MutableList<FamilyTree> = mutableListOf()
            ) : User(name, user_name, password, email, phone_number, user_ID, is_user_child)
{
    fun inviteParentToFamilyTree(var userID : Parent.user_ID, var family_tree : FamilyTree) // Still have to add a way to check so not just anyone can add anybody to any famillytree
    {
        var user : User 
        // user = getuserfromdatabse(user_ID)                                  /**  fetch user itself not just Id but need Database for that */
        family_tree.family_tree_members.add(user)
    }
}
class Parent(
            var family_tree : FamilyTree,
            var is_adminstrator_of_tree : Boolean, // Optional for checking if he is "administrator"   ???
            var list_admin_trees : list<FamilyTree>
            ) : User(name, user_name, password, email, phone_number, user_ID, is_user_child)
{
    
}
