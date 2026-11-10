package Classes

data class ParentData(
            val user_owner_of_data : User,
            var family_trees : MutableList<FamilyTree> = mutableListOf(),
            var list_admin_trees : MutableList<FamilyTree> = mutableListOf()
            )
{
    fun acceptInviteToFamilyTree(given_familytree : FamilyTree) : Boolean{  // Accepting an invite from a Child/Administrator of FamilyTree to join
        answer = false 

        return answer 
    }
    fun inviteChildToTreeIfAdministrator(given_familytree : FamilyTree,child_to_be_invited : User) {    // invite a child to the tree if the parent is adminsitrator of the tree
        if (given_familytree.family_tree_administrator == user_owner_of_data ) {
            if (child_to_be_invited.UserRole == CHILD) {
                given_familytree.family_extra_childs.add(child_to_be_invited)
            }
            else {
                println("The user you are trying to invite is not a child so cant be invited.")
            }
        }
        else {
            printl("You are not an Administrator of the Family, so you dont have the capability of inviting somebody.")
        }
    }
}
