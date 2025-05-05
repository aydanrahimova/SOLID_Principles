package I_InterfaceSegregation.badExample;

public class AdminUser implements UserActions {
    @Override
    public void viewUser() {
        //logic of view user
    }

    @Override
    public void deleteUser() {
        //logic of deleting user
    }
}
