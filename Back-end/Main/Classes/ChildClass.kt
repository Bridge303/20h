package Classes



data class ChildData(
            val user_owner_of_data : User, 
            val emergency_contacts : MutableList<User> = mutableListOf(),
            val child_familys : MutableList<FamilyTree> = mutableListOf(),
            val other_child_family_trees : MutableList<FamilyTree> = mutableListOf(),
            val latest_locations_list : MutableList<Location> = mutableListOf()
            )
{

    init {child_familys.add(childMakeTreeInitialization(user_owner_of_data))} // Makes a familyTree for the child upon creation of Child(Object)
    

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
                this.child_familys.family_tree.family_tree_administrator.add(user_found)     // Might be wrong syntax to target the list
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