package MyPractice.multi_level_inheritance.UniversitySystem;

public class UniversityMember {
    private final String name;
    private final String memberId;

    public UniversityMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {return name;}
    public String getMemberId() {return memberId;}
}
/*
    Base Class Creation:
        Create a base class called UniversityMember.
        Define private member variables: name (type String) and memberId (type String).
        Provide a constructor to initialize these variables.
        Implement public methods getName() and getMemberId() to access these variables.

 */