package I_InterfaceSegregation.goodExample;

public class AdminUser implements AdminActions, Viewer {
    @Override
    public void deleteUser() {
        //logic for deleting user
    }

    @Override
    public void viewUser() {
        //logic for viewing user
    }
}
