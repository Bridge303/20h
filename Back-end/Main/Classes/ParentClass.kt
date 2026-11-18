package Classes
import Functions.*

data class ParentData(
            val user_owner_of_data : User,
            var family_trees : MutableList<FamilyTree> = mutableListOf(),
            var list_admin_trees : MutableList<FamilyTree> = mutableListOf()
            )
{
    fun acceptInviteToFamilyTree(given_familytree : FamilyTree) : Boolean{  // Accepting an invite from a Child/Administrator of FamilyTree to join
        var answer = false 

        return answer 
    }
    fun inviteChildToTreeIfAdministrator(given_familytree : FamilyTree,child_to_be_invited : User) {    // invite a child to the tree if the parent is adminsitrator of the tree
        if (given_familytree.family_tree_administrator == user_owner_of_data ) {        
            if (child_to_be_invited.user_role == UserRole.CHILD) {
                given_familytree.family_extra_childs.add(child_to_be_invited)
            }
            else {
                println("The user you are trying to invite is not a child so cant be invited.")
            }
        }
        else {
            println("You are not an Administrator of the Family, so you dont have the capability of inviting somebody.")
        }
    }
    fun inviteMemberToFamilyTree(userID : Int, family_tree : FamilyTree){
        if (user_owner_of_data in family_tree.family_tree_administrator){
            var temp_user = searchForUserInDatabase(userID)   
            var temp_user_name = temp_user.getUserUserName()
            var temp_family_tree_name = family_tree.getFamilyTreeName()
            family_tree.family_tree_members.add(searchForUserInDatabase(userID))

            println("The person $temp_user_name has been added to the members list of familytree : $temp_family_tree_name")
        } else{
            println("You do not have the rights to do these actions.")
        }
    }
}
