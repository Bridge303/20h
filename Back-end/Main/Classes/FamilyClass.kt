package Classes

class FamilyTree(
                val family_first_child : Child ,
                val family_extra_childs : MutableList<Child> = mutableListOf(),
                val family_tree_administrator : MutableList<Parent> = mutableListOf(),
                var family_tree_members : MutableList<Parent> = mutableListOf()
                ) 
{
    fun getFamilyTreeChilds(): String 
    {
        var temp_extra_child_list = ""
        for (user in family_extra_childs) 
        {
            val name_of_child : String = user.name
            temp_extra_child_list += "$name_of_child "
        }
        return "Care Receiver: $temp_extra_child_list"  // Needs better name then "Patients"
    }

    fun getFamilyTreeAdministrators(): String 
    {
        var temp_extra_admin_list = ""
        for (user in family_tree_administrator) 
        {
            val name_of_admin: String = user.name
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

    fun getFamilyTreeFirstChild(): Child
    {
        val temp_family_first_child = this.family_first_child
        return temp_family_first_child 
    }
}