package Classes
import Functions.*



data class ChildData(
            val user_owner_of_data : User, 
            val emergency_contacts : MutableList<User> = mutableListOf(),
            val child_familys : MutableList<FamilyTree> = mutableListOf(),
            val other_child_family_trees : MutableList<FamilyTree> = mutableListOf(),
            val latest_locations_list : MutableList<Location> = mutableListOf()
            )
{

    init {child_familys.add(childMakeTreeInitialization(user_owner_of_data))} // Makes a familyTree for the child upon creation of Child(Object)
    
    fun getAllChildFamilys() : MutableList<FamilyTree> {
        return child_familys
    }
    
    fun getAllOtherChildFamilyTrees() : MutableList<FamilyTree> {
        return other_child_family_trees
    }

    fun getAllEmergencyContacts() : MutableList<User> {
        return emergency_contacts
    }

    fun inviteParentToFamilyTree(userID : Int, family_tree : FamilyTree) { // Still have to add a way to check so not just anyone can add anybody to any famillytree
        
    }

    fun makeParentAdministrator(userID : Int, family_tree : FamilyTree) {
       
    }
}