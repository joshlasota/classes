fun main(args: Array<String>) {
    val person1 = Contacts(1, "Barney", "Rubble", "barney@aol.com",
        "815-555-1234", "815-555-1111", "815-555-2222")
    val person2 = Contacts(2, "Fred", "Flinstone", "fflint@aol.com",
        "815-555-3334", "815-555-3111", "815-555-5552")
    val person3 = Contacts(3, "Josh", "LaSota", "josh.lasota@aol.com",
        "815-555-3334", "815-555-3111", "815-555-5552")

    person1.printAll()
    println("\n")
    person2.printAll()
    println("\n")
    person3.printAll()

}