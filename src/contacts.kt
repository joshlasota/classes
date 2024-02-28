class Contacts(var contactID: Int,
               var firstName: String?,
               var lastName: String?,
               var emailAddress: String?,
               var phoneHome: String?,
               var phoneWork: String?,
               var phoneCell: String?) {

    init{
        println("New contact added: $firstName $lastName")
    }

    fun printAll() {
        println(contactID.toString() + "\n" + firstName + " " + lastName +
                "\nemail: " + emailAddress + "\nHome Phone: " + phoneHome + "\nWork Phone: " +
                phoneWork + "\nCell Phone: " + phoneCell)
    }
}