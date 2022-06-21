// Without Generic Usage.

// public class CustomerDal implements IEntityRepository {
//    @Override
//    public void add(Object entity) {
//
//    }
//
//    @Override
//    public void delete(Object entity) {
//
//    }
//
//    @Override
//    public void update(Object entity) {
//
//    }
//}

// Generic Usage.

public class CustomerDal implements IEntityRepository<Customer> {

    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}