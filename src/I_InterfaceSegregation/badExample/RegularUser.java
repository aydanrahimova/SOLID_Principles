package I_InterfaceSegregation.badExample;

public class RegularUser implements UserActions {
    @Override
    public void viewUser() {
        //logic for viewing user
    }

    @Override
    public void deleteUser() {
        throw new UnsupportedOperationException("Not allowed");
    }
}
