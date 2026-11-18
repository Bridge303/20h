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

    fun inviteMemberToFamilyTree(userID : Int, family_tree : FamilyTree) { // Still have to add a way to check so not just anyone can add anybody to any famillytree
        if (user_owner_of_data in family_tree.family_tree_administrator || user_owner_of_data == family_tree.family_first_child){
            var temp_user = searchForUserInDatabase(userID)   
            var temp_user_name = temp_user.getUserUserName()
            var temp_family_tree_name = family_tree.getFamilyTreeName()
            family_tree.family_tree_members.add(searchForUserInDatabase(userID))

            println("The person $temp_user_name has been added to the members list of familytree : $temp_family_tree_name")
        } else{
            println("You do not have the rights to do these actions.")
        }
        // Current problem is that if there is no selected role yet that user_woner_of_data isnt initialized yet that it doesnt 
        // do anything and it skips the if and for some reason also the else but no crash
    }

    fun makeParentAdministrator(userID : Int, family_tree : FamilyTree) {
       
    }
}