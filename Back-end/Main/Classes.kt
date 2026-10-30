open class User(
                val name : String,
                var userName : String,
                var password : String,
                var email : String,
                var phoneNumber : Int,
                var userID : Int,
                var isUserChild : Boolean
                ) 
{
    fun getUserInfo() : String {
        return "Name: $name, Username: $userName, Email: $email"
    }
}

class familyTree(
                var familyExtraChilds : List<User>,
                var FamilyTreeOwner : List<User>,
                var FamilyTreeMembers : List<User>
                ) 
{
    
}
class child(
            var EmergencyContactName : List<User>,
            var childFamily : familyTree
            ) : User(name, userName, password, email, phoneNumber, userID, isUserChild)
{
    
}
class parent(
            var familyTree : familyTree
            ) : User(name, userName, password, email, phoneNumber, userID, isUserChild)
{
    
}