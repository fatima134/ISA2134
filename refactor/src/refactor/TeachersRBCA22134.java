package refactor;
public class TeachersRBCA22134 {
    protected String type;

    // Constructor
    public TeachersRBCA22134 (String type) {
        this.type = type;
    }

    // Method to print what the teacher teaches
    public void teaches() {
        System.out.println("The teacher is teaching " + type);
    }
}

// Subclass
class TeacherTeaches extends TeachersRBCA22134{
    private String name;

    // Constructor
    public TeacherTeaches(String type, String name) {
        super(type);
        this.name = name;
    }

    // Method to print the subject
    public void subjects() {
  System.out.println("The teacher " + name + " is teaching " + type);
    }

	public void Teaches() {
		// TODO Auto-generated method stub
		
	}
}
