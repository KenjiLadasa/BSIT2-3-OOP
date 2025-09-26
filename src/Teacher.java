public class Teacher implements LibraryUser {
    private String name;
    private String employeeId;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Teacher";
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (Teacher) borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
        System.out.println(name + " (Teacher) returned: " + media.getTitle());
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }
}
